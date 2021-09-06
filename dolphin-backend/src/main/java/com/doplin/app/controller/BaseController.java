package com.doplin.app.controller;

import com.doplin.app.dto.AjaxResult;
import com.doplin.app.exception.LoginException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@RequestMapping("/api")
@RestControllerAdvice
@Slf4j
public class BaseController {

    @ExceptionHandler(LoginException.class)
    public final AjaxResult handleLoginException(LoginException ex, WebRequest request) {
        log.error("handleException. webRequest={}", request, ex);
        return AjaxResult.fail(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public final AjaxResult handleLoginException(Exception ex, WebRequest request) {
        log.error("handleException. webRequest={}", request, ex);
        return AjaxResult.fail(ex.getMessage());
    }
}
