package com.lming.ltts.common.exception;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:25
 * 3 * @Descripiton: 检查异常
 */
public class CheckException extends RuntimeException {

    public CheckException(String message) {
        super(message);
    }
}
