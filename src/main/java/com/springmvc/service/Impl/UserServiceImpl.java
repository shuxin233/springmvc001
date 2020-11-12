package com.springmvc.service.Impl;


import com.springmvc.dao.IUserDao;
import com.springmvc.domain.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<User> findAll() {
        System.out.println("service业务层：查询所有用户...");
        return iUserDao.findAll();
    }

    @Override
    public void insertUser(User user){
        iUserDao.insertUser(user);
        System.out.println("service业务层：添加一条用户...");
    }





}
