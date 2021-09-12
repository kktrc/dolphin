package com.doplin.app.service;

import com.doplin.app.form.TenantAddForm;
import com.doplin.app.form.TenantEditForm;

public interface TenantService {

    /**
     * 添加租户
     * @param form
     */
    void addTenant(TenantAddForm form);


    /**
     * 编辑
     * @param form
     */
    void editTenant(TenantEditForm form);
}
