package com.example.demo.service;


import com.example.demo.entity.User;

public interface UserService {
    public int getCount();
    public void addUser(User user);
    public User adminlogin(User user);
}
