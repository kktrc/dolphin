package com.doplin.app.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TenantEditForm {

    @NotBlank(message = "name不能为空")
    private String name;
}
