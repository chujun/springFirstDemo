package com.chujun.spring.demo.database.dao.impl;

import com.chujun.spring.demo.database.dao.UserDao;
import com.chujun.spring.demo.database.domain.User;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chujun on 2015/10/29.
 */
@Repository()
public class UserJdbcDao extends JdbcSpitterDao implements UserDao {
    public static final String SQL_INSERT_SPITTER_USER="INSERT INTO  spitter_user (  user_name , password , full_name )VALUES(?,?,?);";
    public static final String SQL_QUERY_GET_USER_BY_ID="SELECT id,user_name,PASSWORD,full_name FROM spitter_user WHERE id=?;";
    /**
     * 没有SQLException，为Spring自定义的非检查异常（运行时异常）
     * @param spitter
     */
    public void addSpitter(User spitter) {
        this.getSimpleJdbcTemplate().update(SQL_INSERT_SPITTER_USER,spitter.getUserName(),spitter.getPassword(),spitter.getFullName());
    }

    public User getUserById(int id) {
        return this.getSimpleJdbcTemplate().queryForObject(SQL_QUERY_GET_USER_BY_ID, new ParameterizedRowMapper<User>() {
            public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                User user=new User();
                user.setId(resultSet.getInt(1));
                user.setUserName(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setFullName(resultSet.getString(4));
                return user;
            }
        },id);
    }
}
