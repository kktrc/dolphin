package com.doplin.app.service.impl;

import com.doplin.app.domin.RoleMenuPO;
import com.doplin.app.domin.RolePO;
import com.doplin.app.form.RoleAddForm;
import com.doplin.app.form.RoleMenuAddForm;
import com.doplin.app.mapper.RoleMapper;
import com.doplin.app.mapper.RoleMenuMapper;
import com.doplin.app.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public void addRole(RoleAddForm input) {
        RolePO rolePO = new RolePO();
        rolePO.setName(input.getName());
        roleMapper.saveRole(rolePO);
    }

    @Override
    public void addRoleMenu(RoleMenuAddForm input) {
        RoleMenuPO roleMenuPO  = new RoleMenuPO();
        roleMenuPO.setRoleId(input.getRoleId());
        roleMenuPO.setMenuId(input.getMenuId());
        roleMenuMapper.saveRoleMenu(roleMenuPO);
    }
}
