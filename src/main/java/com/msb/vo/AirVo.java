package com.msb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date monitorTime;

    private Integer pm10;

    private Integer pm25;

    private String monitoringStation;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;

    private String districtName;
}
