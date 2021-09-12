package com.doplin.app.service;

import com.doplin.app.domin.UserPO;
import com.doplin.app.form.UserAddForm;

public interface UserService {

    /**
     * 登录
     * @param loginId
     * @param password
     */
    UserPO login(String loginId, String password);



    UserPO getByToken(String token);

    /**
     * 添加用户
     * @param form
     */
    void addUser(UserAddForm form);
}
