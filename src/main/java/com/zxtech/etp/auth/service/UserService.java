package com.zxtech.etp.auth.service;

import com.zxtech.etp.auth.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findUser() throws Exception;
}
