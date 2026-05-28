package com.msb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msb.pojo.*;
import com.msb.service.AirService;
import com.msb.util.ResultUtil;
import com.msb.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
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
}
