package com.msb.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msb.pojo.*;
import com.msb.vo.AirVo;

import java.util.*;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 12:05
 * @Description: com.msb.service
 * @version: 1.0
 */
public interface AirService {

    List<District> findDistrictList();

    Page<AirVo> findAirByDistrict(Integer pageNum, Integer pageSize, Integer district);
}
