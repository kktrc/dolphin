package com.doplin.app.mapper;

import com.doplin.app.domin.RoleMenuPO;
import org.apache.ibatis.annotations.Insert;

public interface RoleMenuMapper {


    @Insert("insert into role_menu(role_id, menu_id) values (#{roleId}, #{menuId})")
    int saveRoleMenu(RoleMenuPO roleMenuPO);
}
