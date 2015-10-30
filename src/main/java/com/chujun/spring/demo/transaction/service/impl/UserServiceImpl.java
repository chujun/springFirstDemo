package com.chujun.spring.demo.transaction.service.impl;

import com.chujun.spring.demo.transaction.dao.UserDao;
import com.chujun.spring.demo.transaction.domain.User;
import com.chujun.spring.demo.transaction.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chujun on 2015/10/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    public int addUser(User user) {
       return userDao.addUser(user);
    }

    public User getUserById(int i) {
        return userDao.getUserById(i);
    }
}
