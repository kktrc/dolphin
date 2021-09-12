package com.doplin.app.service.impl;

import com.doplin.app.domin.RoleMenuPO;
import com.doplin.app.domin.RolePO;
import com.doplin.app.domin.UserRolePO;
import com.doplin.app.form.RoleAddForm;
import com.doplin.app.form.RoleMenuAddForm;
import com.doplin.app.form.UserRoleAddForm;
import com.doplin.app.mapper.RoleMapper;
import com.doplin.app.mapper.RoleMenuMapper;
import com.doplin.app.mapper.UserRoleMapper;
import com.doplin.app.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author : moshengeli
 * @date : 2021/9/10
 */
@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleMenuMapper roleMenuMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public void addRole(RoleAddForm input) {
        RolePO rolePO = new RolePO();
        rolePO.setName(input.getName());
        roleMapper.insert(rolePO);
    }

    @Override
    public void addRoleMenu(RoleMenuAddForm input) {
        RoleMenuPO roleMenuPO  = new RoleMenuPO();
        roleMenuPO.setRoleId(input.getRoleId());
        roleMenuPO.setMenuId(input.getMenuId());
        roleMenuMapper.saveRoleMenu(roleMenuPO);
    }

    @Override
    public void setUserRole(UserRoleAddForm input) {
        UserRolePO userRolePO = new UserRolePO();
        userRolePO.setUserId(input.getUserId());
        userRolePO.setRoleId(input.getRoleId());
        userRolePO.setCreateTime(new Date());
        userRolePO.setUpdateTime(new Date());
        userRoleMapper.insert(userRolePO);
    }
}
