package com.service;

import com.entity.S_user;
import org.apache.ibatis.annotations.Param;

public interface UserServiceInterface {

    S_user login(String username,String password);
}
