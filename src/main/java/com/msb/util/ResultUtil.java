package com.msb.util;

import com.msb.vo.ResultVo;

/**
 * @Author: 奇端
 * @Date: 2026/5/28 - 05 - 28 - 12:10
 * @Description: com.msb.util
 * @version: 1.0
 */
public class ResultUtil {

    public static ResultVo ok(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("");

        return resultVo;
    }

    public static ResultVo ok(Object data){
        ResultVo resultVo = ok();

        resultVo.setData(data);
        return resultVo;
    }

    public static ResultVo ok(Object data,Long total){

        ResultVo resultVo = ok(data);
        resultVo.setTotal(total);

        return resultVo;

    }

}
