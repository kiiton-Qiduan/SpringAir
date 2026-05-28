package com.msb.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msb.mapper.*;
import com.msb.pojo.*;
import com.msb.service.AirService;
import com.msb.vo.AirVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 12:11
 * @Description: com.msb.service.impl
 * @version: 1.0
 */
@Service
public class AirServiceImpl implements AirService {

    @Autowired
    private DistrictMapper districtMapper;
    @Autowired
    private AirMapper airMapper;

    @Override
    public List<District> findDistrictList() {
        List<District> districtList = districtMapper.findDistrictList();
        return districtList;
    }

    @Override
    public Page<AirVo> findAirByDistrict(Integer pageNum, Integer pageSize, Integer district) {

//        //先创建Page对象
//        Page<AirVo> page = new Page<>(pageNum,pageSize);
        //创建筛选器
//        LambdaQueryWrapper<Air> wrapper = new LambdaQueryWrapper<>();
//
//        //district不为空拼接
//        wrapper.eq(district != null,
//                Air::getDistrictId,
//                district);

        //查询语句变成两个拼接
        Integer start =
                (pageNum - 1) * pageSize;

        List<AirVo> list = airMapper.findAirByDistrict(
                        start,
                        pageSize,
                        district);

        Page<AirVo> page = new Page<>(pageNum,pageSize);

        page.setRecords(list);

        return page;

    }
}
