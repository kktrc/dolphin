package com.doplin.app.service;

import com.doplin.app.form.RoleAddForm;
import com.doplin.app.form.RoleMenuAddForm;
import com.doplin.app.form.UserRoleAddForm;

public interface RoleService {


    void addRole(RoleAddForm input);


    void addRoleMenu(RoleMenuAddForm input);


    void setUserRole(UserRoleAddForm input);
}
