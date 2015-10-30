package com.chujun.spring.demo.transaction.dao.impl;
import com.chujun.spring.demo.transaction.dao.UserLogDao;
import com.chujun.spring.demo.transaction.dao.impl.JdbcSpitterDao;
import com.chujun.spring.demo.transaction.domain.UserLog;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chujun on 2015/10/30.
 */
@Repository
public class UserLogDaoJdbcImpl extends JdbcSpitterDao implements UserLogDao{
    public static final String SQL_INSERT_USER_LOG="INSERT INTO user_log(user_id,create_time,operation) VALUES (:user_id,:create_time,:operation);";
    public int addUserLog(UserLog log) {
        Map params=new HashMap();
        params.put("user_id",log.getUserId());
        params.put("create_time", log.getCreateTime());
        params.put("operation",log.getOperation());
        return this.getSimpleJdbcTemplate().update(SQL_INSERT_USER_LOG,params);
    }
}
