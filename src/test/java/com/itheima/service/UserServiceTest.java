package com.itheima.service;

import com.itheima.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {
    private UserService userService;
    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("spring/applicationContext*.xml");
        userService = ca.getBean("userServiceImpl", UserService.class);
    }

    @Test
    public void queryAll() {
        List<User> users = userService.queryAll();
        System.out.println("users = " + users);
    }

    @Test
    public void queryUserById() {
        User user = userService.queryUserById(1l);
        System.out.println("user = " + user);
    }

    @Test
    public void deleteById() {
        userService.deleteById(17l);
    }

    @Test
    public void addUser() {
        System.out.println("测试pull");
        System.out.println("dev分支制造冲突");
        System.out.println("dev分支再次制造冲突");
        System.out.println("主分支制造冲突");
        System.out.println("别人提交");
        System.out.println("主分支再次制造冲突");
        System.out.println("别人提交");
         System.out.println("别人再次提交");
    }

    @Test
    public void addTwoUser() {
        /*User user = new User();
        user.setAge(24);
        user.setName("sunlei1111");
        user.setUserName("admin111");
        user.setPassword("1234");
        user.setSex(1);
        User user1 = new User();
        user1.setAge(24);
        user1.setName("sunlei2111");
        user1.setUserName("admin1111");
        user1.setPassword("1234");
        user1.setSex(1);
        userService.addTwoUser(user,user1);*/
    }
}
