package com.msb.pojo;

import lombok.*;

import java.util.Date;

/**
 * @Author: 奇端
 * @Date: 2026/5/27 - 05 - 27 - 21:06
 * @Description: com.msb.pojo
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Air {

    private Integer id;

    private Integer districtId;

    private Date monitorTime;

    private Integer pm10;

    private Integer pm25;

    private String monitoringStation;

    private Date lastModifyTime;
}
