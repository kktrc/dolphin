package com.doplin.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.doplin.app.domin.TenantPO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TenantMapper extends BaseMapper<TenantPO> {


    @Select("select * from tenant")
    List<TenantPO> selectAll();
}
