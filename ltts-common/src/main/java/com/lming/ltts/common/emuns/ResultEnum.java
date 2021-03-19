package com.lming.ltts.common.emuns;

import com.lming.ltts.common.interfaces.ResultInterface;
import lombok.Getter;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:19
 * 3 * @Descripiton:
 */
@Getter
public enum ResultEnum implements ResultInterface {

    SUCCESS(200,"成功"),

    FAILED(401,"失败");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
