package com.lming.ltts.dict;

import java.util.List;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/19 0019 下午 6:46
 * 3 * @Descripiton:
 */
public interface IDictService {

    List<DictEntity> getDictsByType(String type);

    DictEntity getDictByKey(String dictKey);

    DictEntity getDictByTypeAndKey(String type,String key);

    String getDictValueByKey(String key);
}
