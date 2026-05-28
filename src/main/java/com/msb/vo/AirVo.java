package com.msb.vo;

import lombok.*;

import java.util.Date;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 17:22
 * @Description: com.msb.vo
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AirVo {
    private Integer id;

    private Integer districtId;

    private Date monitorTime;

    private Integer pm10;

    private Integer pm25;

    private String monitoringStation;

    private Date lastModifyTime;

    private String districtName;
}
