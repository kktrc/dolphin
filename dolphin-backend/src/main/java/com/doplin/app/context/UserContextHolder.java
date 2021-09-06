package com.doplin.app.context;

import com.doplin.app.domin.UserPO;

/**
 * @description: 用户信息保存在threadLocal中
 * @author: chenyc
 * @date: 2021-02-08
 */
public class UserContextHolder {

    private static final ThreadLocal<UserPO> USER_CACHE = new ThreadLocal<>();

    /**
     * 设置用户缓存
     * @param user
     */
    public static void setUser(UserPO user){
        USER_CACHE.set(user);
    }

    /**
     * 获取用户缓存
     */
    public static UserPO getUser(){
        return USER_CACHE.get();
    }

    /**
     * 删除用户缓存
     */
    public static void delete(){
        USER_CACHE.remove();
    }

}

