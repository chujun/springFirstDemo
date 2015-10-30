package com.chujun.spring.demo.transaction.dao;

import com.chujun.spring.demo.transaction.domain.User;

/**
 * Created by chujun on 2015/10/29.
 */
public interface UserDao {
    public int addUser(User spitter);

    public User getUserById(int id);
}
