package com.doplin.app.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author : moshengeli
 * @date : 2021/9/10
 */
@Data
public class RoleAddForm {

    @NotBlank
    private String name;
}
