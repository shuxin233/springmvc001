package com.springmvc.test;


import com.springmvc.domain.User;
import com.springmvc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public void findAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService as = (UserService) ac.getBean("userService");
        as.findAll();
    }

    @Test
    public void insertUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService as = (UserService) ac.getBean("userService");
        User user=null;
        as.insertUser(user);
    }

}
