package com.doplin.app.form;

import lombok.Data;

@Data
public class MenuAddForm {

    private String name;

    private Long parentId;

    private String icon;
}
