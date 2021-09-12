package com.doplin.app.service.impl;

import com.doplin.app.domin.TenantPO;
import com.doplin.app.form.TenantAddForm;
import com.doplin.app.form.TenantEditForm;
import com.doplin.app.mapper.TenantMapper;
import com.doplin.app.service.TenantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class TenantServiceImpl implements TenantService {

    @Autowired
    private TenantMapper tenantMapper;

    @Override
    public void addTenant(TenantAddForm form) {
        TenantPO tenantPO = new TenantPO();
        tenantPO.setName(form.getName());
        tenantPO.setCreateTime(new Date());
        tenantPO.setUpdateTime(new Date());
        tenantMapper.insert(tenantPO);
    }

    @Override
    public void editTenant(TenantEditForm form) {


    }
}
