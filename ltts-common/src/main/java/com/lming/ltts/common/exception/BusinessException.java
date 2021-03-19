package com.lming.ltts.common.exception;

import com.lming.ltts.common.emuns.ResultEnum;
import com.lming.ltts.common.interfaces.ResultInterface;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:20
 * 3 * @Descripiton: 业务出现异常
 */
public class BusinessException extends BasicException {


    protected BusinessException() {
        super();
    }

    protected BusinessException(String message) {
        super(message);
    }

    protected BusinessException(Integer code, String message) {
        super(code, message);
    }

    protected BusinessException(ResultEnum resultEnum) {
        super(resultEnum);
    }

    protected BusinessException(ResultInterface resultInterface) {
        super(resultInterface);
    }

    public static void main(String[] args) {
        throw new BusinessException(201,"sssss");
    }
}
