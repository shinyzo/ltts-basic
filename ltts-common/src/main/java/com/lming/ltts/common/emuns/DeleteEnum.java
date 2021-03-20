package com.lming.ltts.common.emuns;


import com.lming.ltts.common.interfaces.ResultInterface;
import lombok.Getter;

/**
 * Created by Administrator on 2020/4/26 0026.
 */
@Getter
public enum DeleteEnum implements ResultInterface {

    DELETED(1,"已删除"),
    NOT_DELETE(0,"未删除");

    private Integer code;

    private String message;

    DeleteEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
