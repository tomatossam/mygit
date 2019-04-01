package com.example.demo.service.impl;


import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by a on 2018/10/21.
 */
@Repository
public class UserServiceimpl implements UserService {

    @Autowired
    UserDao userDao;

    public int getCount() {

        return userDao.getCount();
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }


    public User adminlogin(User user) {
        return userDao.adminlogin(user);
    }
}
