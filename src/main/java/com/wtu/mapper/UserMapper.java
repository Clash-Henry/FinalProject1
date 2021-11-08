package com.wtu.mapper;

import com.wtu.entity.User;

public interface UserMapper {

    //注册（添加用户）
    void insertUser(User user);
    //登录
    User userLogin(User user);
    //根据uid查询user
    User userById(int id);
    //根据username查询uid
    int UidByUser(String username);
}
