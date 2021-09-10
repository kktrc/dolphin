package com.doplin.app.service;

import com.doplin.app.form.RoleAddForm;
import com.doplin.app.form.RoleMenuAddForm;

public interface RoleService {


    void addRole(RoleAddForm input);


    void addRoleMenu(RoleMenuAddForm input);
}
