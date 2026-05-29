package com.msb.handler;

import com.msb.util.ResultUtil;
import com.msb.vo.ResultVo;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 22:38
 * @Description: com.msb.handler
 * @version: 1.0
 */
@RestControllerAdvice
public class AirExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResultVo ex(Exception ex){
        return ResultUtil.error(-1,ex.getMessage());
    }

}
