package com.doplin.app.domin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author : moshengeli
 * @date : 2021/9/6
 */
@Data
@TableName("user")
public class UserPO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String token;

    private String loginId;

    private String password;

    private String name;

    private Integer gender;

    private Date createTime;

    private Date updateTime;

}
