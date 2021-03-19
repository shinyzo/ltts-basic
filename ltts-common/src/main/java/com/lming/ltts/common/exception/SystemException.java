package com.lming.ltts.common.exception;

import com.lming.ltts.common.emuns.ResultEnum;
import com.lming.ltts.common.interfaces.ResultInterface;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:20
 * 3 * @Descripiton: 系统异常
 */
public class SystemException extends BasicException {

    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Integer code, String message) {
        super(code, message);
    }

    public SystemException(ResultEnum resultEnum) {
        super(resultEnum);
    }

    public SystemException(ResultInterface resultInterface) {
        super(resultInterface);
    }
}
