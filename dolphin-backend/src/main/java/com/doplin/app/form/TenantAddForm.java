package com.doplin.app.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TenantAddForm {

    @NotBlank
    private String name;
}
