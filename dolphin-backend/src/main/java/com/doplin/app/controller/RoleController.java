package com.doplin.app.controller;

import com.doplin.app.dto.AjaxResult;
import com.doplin.app.form.RoleAddForm;
import com.doplin.app.form.UserRoleAddForm;
import com.doplin.app.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : moshengeli
 * @date : 2021/9/10
 */
@RestController
@Slf4j
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    /**
     * 添加角色
     * @param roleAddForm
     * @return
     */
    @PostMapping("/role/add")
    public AjaxResult roleAdd(@RequestBody @Validated RoleAddForm roleAddForm) {
        roleService.addRole(roleAddForm);
        return AjaxResult.success("OK");
    }

    /**
     * 给用户设置角色
     * @param form
     * @return
     */
    @PostMapping("/role/set_user")
    public AjaxResult setUserRole(@RequestBody @Validated UserRoleAddForm form) {
        roleService.setUserRole(form);
        return AjaxResult.success("OK");
    }
}
