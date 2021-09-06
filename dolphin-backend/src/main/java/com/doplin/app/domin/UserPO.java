package com.doplin.app.domin;

import lombok.Data;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@Data
public class UserPO {

    private Long id;

    private String token;

    private String loginId;

    private String password;

    private String name;
}
