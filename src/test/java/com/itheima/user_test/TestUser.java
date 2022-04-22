package com.itheima.user_test;


import com.itheima.entity.User;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestUser {
    //希望测试IOC容器中的对象直接注入即可
    @Autowired
    private UserService userService;

    @Test
    public void testMybatisSpring(){
        List<User> users = userService.findAll();
        users.forEach(System.out::println);
    }
}
