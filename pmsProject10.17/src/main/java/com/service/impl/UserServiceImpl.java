package com.service.impl;

import com.dao.UserDaoMapper;
import com.entity.S_user;
import com.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface {
    @Autowired
    UserDaoMapper daoMapper;



    @Override
    public S_user login(String username, String password) {
        return daoMapper.login(username,password);
    }
}
