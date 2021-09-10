package com.doplin.app.controller;

import com.doplin.app.dto.AjaxResult;
import com.doplin.app.form.RoleAddForm;
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

    @PostMapping("/role/add")
    public AjaxResult roleAdd(@RequestBody @Validated RoleAddForm roleAddForm) {
        roleService.addRole(roleAddForm);
        return AjaxResult.success("OK");
    }
}
