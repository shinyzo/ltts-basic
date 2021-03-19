package com.lming.ltts.common.exception;

import com.lming.ltts.common.emuns.ResultEnum;
import com.lming.ltts.common.interfaces.ResultInterface;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:25
 * 3 * @Descripiton: 检查异常
 */
public class CheckException extends BasicException {

    protected CheckException() {
        super();
    }

    protected CheckException(String message) {
        super(message);
    }

    protected CheckException(Integer code, String message) {
        super(code, message);
    }

    protected CheckException(ResultEnum resultEnum) {
        super(resultEnum);
    }

    protected CheckException(ResultInterface resultInterface) {
        super(resultInterface);
    }
}
