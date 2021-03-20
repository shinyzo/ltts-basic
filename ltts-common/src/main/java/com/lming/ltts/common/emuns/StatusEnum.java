package com.lming.ltts.common.emuns;


import lombok.Getter;

/**
 * Created by Administrator on 2020/4/26 0026.
 */
@Getter
public enum StatusEnum {

    VALID(1,"有效"),
    IN_VALID(0,"无效");

    private Integer status;

    private String message;

    StatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
