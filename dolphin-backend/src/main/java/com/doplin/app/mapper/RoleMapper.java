package com.doplin.app.mapper;

import com.doplin.app.domin.RolePO;
import org.apache.ibatis.annotations.Insert;

public interface RoleMapper {

    @Insert("insert into role(name) values (#{name})")
    int saveRole(RolePO rolePO);
}
