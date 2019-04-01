package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by a on 2018/10/22.
 */
@RestController
public class UserController {
    @Resource
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/test/user/getCount",method = RequestMethod.GET)
    public int getTestCount(){

        return userService.getCount();
    }

    @RequestMapping(value = "/test/user/addUser",method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/test/user/adminlogin",method = RequestMethod.POST)
        public int adminlogin(@RequestBody User user){
            User chekuser = userService.adminlogin(user);
            if(chekuser.getPwd() == user.getPwd()){
                return 1;
            }
            else {
                return 0;
            }
    }
}
