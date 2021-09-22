package com.doplin.app.controller;

import com.doplin.app.dto.AjaxResult;
import com.doplin.app.form.TenantAddForm;
import com.doplin.app.form.TenantEditForm;
import com.doplin.app.service.TenantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TenantController extends BaseController {

    @Autowired
    private TenantService tenantService;

    /**
     * 添加租户
     * @param input
     * @return
     */
    @PostMapping("/tenant/add")
    public AjaxResult addTenant(@RequestBody @Validated TenantAddForm input) {
        tenantService.addTenant(input);
        return AjaxResult.success("OK");
    }

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/tenant/all")
    public AjaxResult tenantAll() {
        return AjaxResult.success(tenantService.selectAll());
    }

    /**
     * 编辑
     * @param input
     * @return
     */
    @PostMapping("/tenant/update")
    public AjaxResult editTenant(@RequestBody @Validated TenantEditForm input) {
        tenantService.editTenant(input);
        return AjaxResult.success("OK");
    }
}
