package com.dao;

import com.entity.S_user;
import org.apache.ibatis.annotations.Param;

public interface UserDaoMapper {

    //登录功能
    S_user login2(@Param("s_user") S_user s_user);
    S_user login(@Param("username") String username,@Param("password")String password);
}
