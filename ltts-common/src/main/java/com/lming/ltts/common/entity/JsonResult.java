package com.lming.ltts.common.entity;

import com.lming.ltts.common.emuns.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:19
 * 3 * @Descripiton:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JsonResult<T> implements IResult{

    public static JsonResult SUCCESS = success(null);

    public static JsonResult FAILED = failed();

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;



    public static <T> JsonResult success(T data){

        return new JsonResult(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMessage(),data);
    }


    public static <T> JsonResult failed(){

        return failed(ResultEnum.FAILED);
    }

    /**
     * 失败
     * @param message
     * @param <T>
     * @return
     */
    public static <T> JsonResult failed(String message){

        return new JsonResult(ResultEnum.FAILED.getCode(),message,null);
    }

    /**
     * 失败枚举
     * @param resultEnum
     * @param <T>
     * @return
     */
    public static <T> JsonResult failed(ResultEnum resultEnum){

        return new JsonResult(resultEnum.getCode(),resultEnum.getMessage(),null);
    }


    /**
     * 公共结果
     * @param code
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> JsonResult result(Integer code,String message ,T data){

        return new JsonResult(code,message,data);
    }

}
