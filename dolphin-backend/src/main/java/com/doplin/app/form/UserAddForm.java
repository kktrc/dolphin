package com.doplin.app.form;

import lombok.Data;

@Data
public class UserAddForm {

    private String name;

    private Integer gender;

    private String loginId;

    private String password;
}
