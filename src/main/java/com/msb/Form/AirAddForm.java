package com.msb.Form;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 22:14
 * @Description: com.msb.Form
 * @version: 1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AirAddForm {

    @NotNull(message = "地区id必须写！")
    private Integer districtId;

    @NotNull(message = "检测时间必须写！")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date monitorTime;

    @NotNull(message = "pm10必须写！")
    private Integer pm10;

    @NotNull(message = "pm2.5必须写！")
    private Integer pm25;

    @NotNull(message = "检测站必须写！")
    private String monitoringStation;

}
