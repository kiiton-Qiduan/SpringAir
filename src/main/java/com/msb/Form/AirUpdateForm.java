package com.msb.Form;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: 奇端
 * @Date: 2026/5/29 - 05 - 29 - 15:31
 * @Description: com.msb.Form
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AirUpdateForm {

    @NotNull(message = "id为必传项")
    private Integer id;

    private Integer districtId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyy-MM-dd")
    private Date monitorTime;

    private Integer pm10;

    private Integer pm25;

    private String monitoringStation;

}
