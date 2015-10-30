package com.chujun.spring.demo.transaction.dao;

import com.chujun.spring.demo.transaction.domain.UserLog;

/**
 * Created by chujun on 2015/10/30.
 */
public interface UserLogDao {
    public int addUserLog(UserLog log);
}
