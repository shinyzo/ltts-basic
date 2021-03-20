package com.lming.ltts.common.emuns;

import com.lming.ltts.common.interfaces.ResultInterface;
import lombok.Getter;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:19
 * 3 * @Descripiton:
 */
@Getter
public enum ParamEnum implements ResultInterface {

    PARAM_NOT_NULL(601,"参数不能为空"),

    PARAM_NOT_NUMBER(602,"参数非数字");

    private Integer code;

    private String message;

    ParamEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
