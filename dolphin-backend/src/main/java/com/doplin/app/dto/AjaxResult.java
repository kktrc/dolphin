package com.doplin.app.dto;

import lombok.Data;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@Data
public class AjaxResult {

    private static final int SUCCESS_CODE = 0;
    private static final int FAIL_CODE = 500;

    private int code;
    private String msg;
    private Object data;

    public static AjaxResult success(Object data) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setCode(SUCCESS_CODE);
        ajaxResult.setData(data);
        return ajaxResult;
    }

    public static AjaxResult fail(String msg) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setCode(FAIL_CODE);
        ajaxResult.setMsg(msg);
        return ajaxResult;
    }
}
