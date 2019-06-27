package com.itheima.service.impl;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryAll() {
        List<User> users = userMapper.queryAll();
        return users;
    }

    @Override
    public User queryUserById(Long id) {
        User user = userMapper.queryUserById(id);
        return user;
    }

    @Override
    public void deleteById(Long id) {
        userMapper.deleteById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void addTwoUser(User user1, User user2) {
        userMapper.addUser(user1);
//        int i = 1 / 0;
        userMapper.addUser(user2);
    }

}
