package com.lming.ltts.common.emuns;

import com.lming.ltts.common.interfaces.ResultInterface;
import lombok.Getter;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:19
 * 3 * @Descripiton:
 */
@Getter
public enum CheckEnum implements ResultInterface {

    CHECK_PHONE_LENGTH_ERROR(611,"手机号位数不正确"),
    ;
    private Integer code;

    private String message;

    CheckEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
