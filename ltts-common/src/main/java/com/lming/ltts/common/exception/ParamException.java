package com.lming.ltts.common.exception;

import com.lming.ltts.common.emuns.ResultEnum;
import com.lming.ltts.common.interfaces.ResultInterface;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:26
 * 3 * @Descripiton: 参数异常
 */
public class ParamException extends BasicException {


    protected ParamException() {
        super();
    }

    protected ParamException(String message) {
        super(message);
    }

    protected ParamException(Integer code, String message) {
        super(code, message);
    }

    protected ParamException(ResultEnum resultEnum) {
        super(resultEnum);
    }

    protected ParamException(ResultInterface resultInterface) {
        super(resultInterface);
    }
}
