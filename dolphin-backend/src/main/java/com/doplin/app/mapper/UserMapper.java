package com.doplin.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.doplin.app.domin.UserPO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<UserPO> {

    @Select("select * from user where login_id = #{loginId}")
    UserPO selectByLoginId(@Param("loginId") String loginId);


    @Select("select * from user where token = #{token}")
    UserPO selectByToken(String token);
}
