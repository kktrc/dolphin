package com.doplin.app.controller;

import com.doplin.app.dto.AjaxResult;
import com.doplin.app.form.UserAddForm;
import com.doplin.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : moshengeli
 * @date : 2021/9/10
 */
@RestController
@Slf4j
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * @param userAddForm
     * @return
     */
    @PostMapping("/user/add")
    public AjaxResult addUser(@RequestBody UserAddForm userAddForm) {
        userService.addUser(userAddForm);
        return AjaxResult.success("OK");
    }
}
