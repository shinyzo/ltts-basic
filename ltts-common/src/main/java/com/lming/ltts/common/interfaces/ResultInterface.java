package com.lming.ltts.common.interfaces;

/**
 * 结果枚举接口
 * @author zhangliangming
 * @date 2020/2/15
 */
public interface ResultInterface {

    /**
     * 获取状态编码
     * @return 编码
     */
    Integer getCode();

    /**
     * 获取提示信息
     * @return 提示信息
     */
    String getMessage();

}
