package com.doplin.app.domin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author : moshengeli
 * @date : 2021/9/10
 */
@Data
@TableName("menu")
public class MenuPO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long parentId;

    private String name;

    private String icon;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}
