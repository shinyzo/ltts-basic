package com.lming.ltts.dict;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 6:46
 * 3 * @Descripiton:
 */
@Data
public class DictEntity {

    /**
     * id
     */
    private Long id;

    /**
     * 类型
     */
    private String type;
    /**
     * 字典编码
     */
    private String dictCode;

    /**
     * 字典值
     */
    private String dictValue;

    /**
     * 字典值2
     */
    private String dictValue2;

    /**
     * 备注字段
     */
    private String remark;

}
