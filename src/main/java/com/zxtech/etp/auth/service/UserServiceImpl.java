package com.zxtech.etp.auth.service;

import com.zxtech.etp.auth.mapper.UserMapper;
import com.zxtech.etp.auth.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        List<User> users = userMapper.selectByExample(null);
        return users;
    }
}
