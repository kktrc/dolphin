package com.doplin.app.interceptor;

import com.doplin.app.context.UserContextHolder;
import com.doplin.app.domin.UserPO;
import com.doplin.app.exception.LoginException;
import com.doplin.app.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = getToken(request);
        if (StringUtils.isBlank(token)) {
            throw new LoginException("当前用户未登录,请登录");
        }
        UserPO user = userService.getByToken(token);
        UserContextHolder.setUser(user);
        return true;
    }

    private String getToken(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie: cookies) {
                if (cookie.getName().equals("token")) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
