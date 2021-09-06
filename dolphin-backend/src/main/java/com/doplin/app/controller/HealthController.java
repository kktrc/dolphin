package com.doplin.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@RestController
@Slf4j
public class HealthController {

    @GetMapping("/helath")
    public String health() {
        return "OK";
    }
}
