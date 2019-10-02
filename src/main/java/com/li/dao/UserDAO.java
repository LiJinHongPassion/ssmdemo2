package com.li.dao;

import com.li.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, String> {
    User login(@Param("username") String username, @Param("pwd") String pwd);
}