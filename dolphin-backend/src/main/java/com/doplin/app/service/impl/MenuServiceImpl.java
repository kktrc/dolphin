package com.doplin.app.service.impl;

import com.doplin.app.domin.MenuPO;
import com.doplin.app.form.MenuAddForm;
import com.doplin.app.mapper.MenuMapper;
import com.doplin.app.service.MenuService;
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
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public void addMenu(MenuAddForm input) {
        MenuPO menuPO = new MenuPO();
        menuPO.setName(input.getName());
        menuPO.setIcon(input.getIcon());
        menuPO.setParentId(input.getParentId());
        menuPO.setCreateTime(new Date());
        menuPO.setUpdateTime(new Date());
        menuMapper.insert(menuPO);
    }
}
