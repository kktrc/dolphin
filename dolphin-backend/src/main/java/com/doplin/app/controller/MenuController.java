package com.doplin.app.controller;

import com.doplin.app.dto.AjaxResult;
import com.doplin.app.form.MenuAddForm;
import com.doplin.app.service.MenuService;
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
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;

    /**
     * 添加菜单
     * @param form
     * @return
     */
    @PostMapping("/menu/add")
    public AjaxResult addMenu(@RequestBody MenuAddForm form) {
        menuService.addMenu(form);
        return AjaxResult.success("OK");
    }
}
