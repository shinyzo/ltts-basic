package com.lming.ltts.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhangliangming
 * @Date: 2021/3/20 1:17.
 * Description:  java vm 的内存进行数据缓存，线程安全
 */
public final class JVMMemoryCache<K,V> implements ICache<K,V> {

    // 保证更新操作的原子性
    private final Map<K,V> map = new ConcurrentHashMap<K,V>();

    private static JVMMemoryCache instance = null;

    private JVMMemoryCache(){
    }

    /**
     * double check single instance
     * @return
     */
    public static JVMMemoryCache getInstance(){
        if(instance == null){
            synchronized (JVMMemoryCache.class){
                if(instance ==null){
                    instance = new JVMMemoryCache();
                }
            }
        }
        return instance;
    }

    @Override
    public void put(K k, V v) {
        map.put(k,v);
    }

    @Override
    public V get(K k) {
        return map.get(k);
    }

    @Override
    public boolean contains(K k) {
        return get(k) == null ? false : true;
    }

    public static void main(String[] args) {
        JVMMemoryCache<String,String> javaMemoryCache =  JVMMemoryCache.getInstance();
        javaMemoryCache.put("aa","bb");
        javaMemoryCache.put("aa","cc");
        String aa = javaMemoryCache.get("aa");
        System.out.println(aa);
    }
}