package com.wtu.service;

import com.wtu.entity.User;
import com.wtu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User userLogin(User user) {
        User user1 = userMapper.userLogin(user);
        return user1;
    }

    @Override
    public User userById(int id) {
        return userMapper.userById(id);
    }

    @Override
    public int UidByUser(String username) {
        return userMapper.UidByUser(username);
    }
}
