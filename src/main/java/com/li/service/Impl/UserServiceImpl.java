package com.li.service.Impl;

import com.li.dao.UserDAO;
import com.li.pojo.User;
import com.li.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LJH
 * @date 2019/9/27-8:52
 * @QQ 1755497577
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public User login(String username, String pwd) {
        User user = userDAO.login(username, pwd);
        return user;
    }

    @Override
    public User register(User user) {
        user.setUserId(String.valueOf(System.currentTimeMillis()));
        int re = userDAO.insert(user);
        //添加成功
        if(re == 1){
            return user;
        }
        //添加失败
        return null;
    }
}