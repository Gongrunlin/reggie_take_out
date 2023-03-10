package com.itheima.reggie.common;

/**
 * @author $(USER)
 * @description 基于threadlocal封装的工具类，用于保存和获取当前线程登陆用户的ID
 * @date 2023/3/10 14:54
 * @Version 1.0
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
