package com.chujun.spring.demo.database.dao;

import com.chujun.spring.demo.database.domain.User;

/**
 * Created by chujun on 2015/10/29.
 */
public interface UserDao {
    public void addSpitter(User spitter);

    public User getUserById(int id);
}
