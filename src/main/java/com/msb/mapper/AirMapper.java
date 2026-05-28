package com.msb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msb.pojo.Air;
import com.msb.vo.AirVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 15:06
 * @Description: com.msb.mapper
 * @version: 1.0
 */

public interface AirMapper extends BaseMapper {

    List<AirVo> findAirByDistrict(
            @Param("start") Integer start,
            @Param("size") Integer size,
            @Param("district") Integer district
    );
}
