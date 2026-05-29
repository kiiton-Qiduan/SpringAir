package com.msb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msb.Form.*;
import com.msb.pojo.*;
import com.msb.service.AirService;
import com.msb.util.ResultUtil;
import com.msb.vo.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 12:03
 * @Description: com.msb.controller
 * @version: 1.0
 */
@RestController
public class AirController {

    @Autowired
    private AirService airService;


    @GetMapping("/district/list")
    public ResultVo districtList(){

        List<District> districtList = airService.findDistrictList();
        return ResultUtil.ok(districtList);
    }

    @GetMapping("/air/list")
    public ResultVo findAirByDistrict(@RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "5") Integer pageSize,
                                      Integer district){

        Page<AirVo> airByDistrict = airService.findAirByDistrict(pageNum, pageSize, district);

        return ResultUtil.ok(airByDistrict.getRecords(),airByDistrict.getTotal());

    }


    @PostMapping("/air/add")
    public ResultVo AirAdd(@Valid AirAddForm airAddForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            String defaultMessage = bindingResult.getFieldError().getDefaultMessage();
            ResultVo error = ResultUtil.error(400,defaultMessage);
            return error;
        }


        Integer rows = airService.airAdd(airAddForm);

        if(rows == 1){
            return ResultUtil.ok();
        }
        else {
            System.out.println("【删除空气质量】  删除失败！！");
            throw new RuntimeException("【删除空气质量】  删除失败！！");
        }

    }

    @PutMapping("/air/update")
    public ResultVo AirUpdate(@Valid @RequestBody AirUpdateForm airUpdateForm,BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            String defaultMessage = bindingResult.getFieldError().getDefaultMessage();
            ResultVo error = ResultUtil.error(400, defaultMessage);
            return error;
        }

        Integer i = airService.AirUpdate(airUpdateForm);

        if(i == 1){
            return ResultUtil.ok();
        }else{
            System.out.println("【修改空气质量】  修改失败！！");
            throw new RuntimeException("【修改空气质量】  修改失败！！");
        }
    }

    @DeleteMapping("/air/delete")
    public ResultVo AirDelete(@RequestParam Integer id){

        if(id == null){
            throw new RuntimeException("没有传入id！");
        }

        Integer i = airService.airDelete(id);
        if(i == 1){
            return ResultUtil.ok();
        }
        else{
            throw new RuntimeException("删除失败！");
        }
    }

}
