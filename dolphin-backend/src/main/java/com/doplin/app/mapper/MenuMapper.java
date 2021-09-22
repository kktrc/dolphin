package com.doplin.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.doplin.app.domin.MenuPO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper extends BaseMapper<MenuPO> {


    @Select("select * from menu")
    List<MenuPO> selectAll();


    @Select("select * from menu where parent_id = #{parentId}")
    List<MenuPO> selectByParent(@Param("parentId") long parentId);
}
