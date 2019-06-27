package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {
    private UserMapper mapper;

    @Before
    public void setUp() throws Exception {
       /* //1、定义配置文件
        String path = "mybatis/mybatis-config.xml";
        //2、读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        //3、通过配置文件创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //4、通过sqlSessionFactory创建sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4、动态代理获取userMapper
        mapper = sqlSession.getMapper(UserMapper.class);*/
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring/applicationContext*.xml");
       /* SqlSessionFactory sqlSessionFactory = cc.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);*/
        mapper = cc.getBean(UserMapper.class);
    }

    @Test
    public void queryAll() {
        List<User> users = mapper.queryAll();
        for (User user : users){
            System.out.println("user = " + user);
        }
    }

    @Test
    public void queryUserById() {
        User user = mapper.queryUserById(1L);
        System.out.println("user = " + user);
    }

    @Test
    public void addUser() {
        /*User user = new User();
        user.setAge(24);
        user.setName("sunlei");
        user.setUserName("admin");
        user.setPassword("1234");
        user.setSex(1);
        mapper.addUser(user);*/
    }


}