package com.li.service;


import com.li.pojo.User;

/**
 * @author LJH
 * @date 2019/9/27-8:50
 * @QQ 1755497577
 */
public interface IUserService {

    /**
     * 描述:登录方法接口
     *
     * @author LJH-1755497577 2019/9/27 8:51
     * @param username 用户名
     * @param pwd 密码
     * @return com.cqut.simpledemo.pojo.User 成功匹配返回具体对象，失败返回null
     */
    User login(String username, String pwd);

    /**
     * 描述: 注册方法接口
     *
     * @author LJH-1755497577 2019/9/27 9:40
     * @param user 只包含用户名和密码，id需设置
     * @return com.cqut.simpledemo.pojo.User 注册成功返回user，失败返回null
     */
    User register(User user);
}