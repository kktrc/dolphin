package com.doplin.app.service.impl;

import com.doplin.app.domin.UserPO;
import com.doplin.app.exception.LoginException;
import com.doplin.app.mapper.UserMapper;
import com.doplin.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserPO login(String loginId, String password) {
        log.info("login: loginId: {}, password: {}", loginId, password);
        if (StringUtils.isBlank(loginId)) {
            throw new LoginException("登录名不能为空");
        }
        if (StringUtils.isBlank(password)) {
            throw new LoginException("密码不能为空");
        }
        UserPO userPO = userMapper.selectByLoginId(loginId);
        if (userPO == null) {
            throw new LoginException("当前用户不存在");
        }
        // check password
        String md5Password = DigestUtils.md5Hex(password);
        if (md5Password.equals(userPO.getPassword())) {
            return userPO;
        }
        throw new LoginException("密码不正确");
    }

    @Override
    public UserPO getByToken(String token) {
        return userMapper.selectByToken(token);
    }
}
