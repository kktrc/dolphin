package com.doplin.app.domin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tenant")
public class TenantPO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;
}
