package com.doplin.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.doplin.app.domin.RolePO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper extends BaseMapper<RolePO> {


    @Select("select * from role")
    List<RolePO> selectAll();


    @Select("select * from role where tenant_id = #{tenantId}")
    List<RolePO> selectByTenant(@Param("tenantId") long tenantId);
}
