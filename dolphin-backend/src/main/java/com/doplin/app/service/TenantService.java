package com.doplin.app.service;

import com.doplin.app.domin.TenantPO;
import com.doplin.app.form.TenantAddForm;
import com.doplin.app.form.TenantEditForm;

import java.util.List;

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


    /**
     * 查询
     * @return
     */
    List<TenantPO> selectAll();
}
