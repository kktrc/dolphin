package com.doplin.app.dto;

import lombok.Data;

import java.util.List;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@Data
public class UserDto {

    private Long id;

    private String token;

    private String loginId;

    private String name;

    private List<String> roles;
}
