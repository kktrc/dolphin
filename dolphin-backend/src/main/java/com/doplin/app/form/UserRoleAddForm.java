package com.doplin.app.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserRoleAddForm {

    @NotNull
    private Long userId;

    @NotNull
    private Long roleId;
}
