package com.doplin.app.controller;

import com.doplin.app.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
}
