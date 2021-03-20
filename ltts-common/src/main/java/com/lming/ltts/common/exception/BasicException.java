package com.lming.ltts.common.exception;

import com.lming.ltts.common.emuns.ResultEnum;
import com.lming.ltts.common.interfaces.ResultInterface;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/20 0:18.
 * Description:
 */
public class BasicException extends RuntimeException {

    private Integer code;


    protected BasicException() {
    }

    protected BasicException(String message) {
        super(message);
    }

    protected BasicException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    protected BasicException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    protected BasicException(ResultInterface resultInterface) {
        super(resultInterface.getMessage());
        this.code = resultInterface.getCode();
    }
}