package com.doplin.app.domin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author : moshengeli
 * @date : 2021/9/10
 */
@Data
@TableName("role")
public class RolePO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long tenantId;

    private String name;
}
