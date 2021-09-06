package com.doplin.app.controller;

import com.doplin.app.domin.UserPO;
import com.doplin.app.dto.AjaxResult;
import com.doplin.app.dto.LoginDto;
import com.doplin.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@RestController
@Slf4j
public class LoginController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param loginDto
     * @return
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginDto loginDto, HttpServletResponse response) {
        UserPO user = userService.login(loginDto.getLoginId(), loginDto.getPassword());
        Cookie cookie = new Cookie("token", user.getToken());
        cookie.setPath("/");
        cookie.setMaxAge(3600 * 24);
        response.addCookie(cookie);
        return AjaxResult.success("OK");
    }
}
