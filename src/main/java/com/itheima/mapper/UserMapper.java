package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> queryAll();

    User queryUserById(@Param("id") Long id);

    void deleteById(@Param("id") Long id);

    void addUser(User user);
}
