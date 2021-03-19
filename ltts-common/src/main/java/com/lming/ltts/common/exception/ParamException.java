package com.lming.ltts.common.exception;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:26
 * 3 * @Descripiton: 参数异常
 */
public class ParamException extends RuntimeException {

    public ParamException(String message) {
        super(message);
    }
}
