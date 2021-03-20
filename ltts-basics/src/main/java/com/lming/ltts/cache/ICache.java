package com.lming.ltts.cache;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/20 1:15.
 * Description:
 */
public interface ICache<K,V> {

    void put(K k,V v);

    V get(K k);

    boolean contains(K k);
}