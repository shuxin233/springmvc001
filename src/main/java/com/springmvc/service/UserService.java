package com.springmvc.service;



import com.springmvc.domain.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public void insertUser(User user);
}
