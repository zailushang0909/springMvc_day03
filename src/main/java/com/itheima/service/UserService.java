package com.itheima.service;

import com.itheima.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();

    User queryUserById(Long id);

    void deleteById(Long id);

    void addUser(User user);

    void addTwoUser(User user1,User user2);
}
