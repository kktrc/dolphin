package com.doplin.app.service;

import com.doplin.app.domin.UserPO;

public interface UserService {

    /**
     * 登录
     * @param loginId
     * @param password
     */
    UserPO login(String loginId, String password);



    UserPO getByToken(String token);
}
