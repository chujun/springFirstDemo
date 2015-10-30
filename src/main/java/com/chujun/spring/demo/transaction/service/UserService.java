package com.chujun.spring.demo.transaction.service;

import com.chujun.spring.demo.transaction.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by chujun on 2015/10/30.
 */

public interface UserService {
    public int addUser(User user);

    User getUserById(int i);

    public int updateUser(User user);
}
