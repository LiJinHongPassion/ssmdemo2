package com.li.controller;

import com.li.pojo.User;
import com.li.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author LJH
 * @date 2019/9/27-8:57
 * @QQ 1755497577
 */
@Controller
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "login")
    @ResponseBody
    public User login(String username, String pwd){
        User user = userService.login(username, pwd);
        return user;
    }

    @RequestMapping(value = "register")
    @ResponseBody
    public User register(User user){
        User user1 = userService.register(user);
        return user;
    }
}