package com.chujun.spring.demo.transaction.service.impl;

import com.chujun.spring.demo.transaction.dao.UserDao;
import com.chujun.spring.demo.transaction.dao.UserLogDao;
import com.chujun.spring.demo.transaction.domain.User;
import com.chujun.spring.demo.transaction.domain.UserLog;
import com.chujun.spring.demo.transaction.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by chujun on 2015/10/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private UserLogDao userLogDao;

    public int addUser(User user) {
       return userDao.addUser(user);
    }

    public User getUserById(int i) {
        return userDao.getUserById(i);
    }

    public int updateUser(User user) {
        int num=userDao.updateUser(user);
        UserLog userLog=new UserLog();
        userLog.setUserId(user.getId());
        userLog.setCreateTime(new Date());
        userLog.setOperation("update".toLowerCase());
        int num2=userLogDao.addUserLog(userLog);
        return num2;
    }
}
