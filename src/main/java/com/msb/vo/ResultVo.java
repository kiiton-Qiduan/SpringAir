package com.msb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 12:06
 * @Description: com.msb.ResultVO
 * @version: 1.0
 */
@Data
public class ResultVo {

    private Integer code;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private Long total;

    private String msg;

    private Object data;

}
