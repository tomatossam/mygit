package com.example.demo.dao;



import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by a on 2018/10/21.
 */
public interface UserDao {
    public int getCount();
    public User addUser(@Param("user") User user);
    public User adminlogin(@Param("user") User user);
}
