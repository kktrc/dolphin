package com.doplin.app.controller;

import com.doplin.app.dto.AjaxResult;
import com.doplin.app.exception.LoginException;
import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.stream.Collectors;

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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public AjaxResult methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        List<String> collect = fieldErrors.stream()
                .map(o -> o.getDefaultMessage())
                .collect(Collectors.toList());
        return AjaxResult.fail(Joiner.on(",").join(collect));
    }
}
