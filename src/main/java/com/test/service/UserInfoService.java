package com.test.service;

import com.test.dao.UserDOMapper;
import com.test.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    public UserDOMapper userDOMapper;

    public UserDO getUser(){
        return userDOMapper.selectByPrimaryKey(1);
    }
}
