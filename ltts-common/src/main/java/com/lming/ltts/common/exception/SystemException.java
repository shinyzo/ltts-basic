package com.lming.ltts.common.exception;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:20
 * 3 * @Descripiton: 系统异常
 */
public class SystemException extends RuntimeException {

    public SystemException(String message) {
        super(message);
    }
}
