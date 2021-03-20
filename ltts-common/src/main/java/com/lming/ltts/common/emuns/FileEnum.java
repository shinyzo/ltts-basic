package com.lming.ltts.common.emuns;

import com.lming.ltts.common.interfaces.ResultInterface;
import lombok.Getter;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 5:19
 * 3 * @Descripiton:
 */
@Getter
public enum FileEnum implements ResultInterface {

    FILE_NOT_EXIST(701,"文件不存在"),
    FILE_NOT_NULL(702,"文件不能为空"),
    ;

    private Integer code;

    private String message;

    FileEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
