package com.lming.ltts.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2020/7/8 0008.
 */
@Data
public class BaseEntity implements Serializable {

    /**
     * 创建者
     */
    private Long createUser;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改者
     */
    private Long modifyUser;
    /**
     * 修改时间
     */
    private Date updateDate;
}
