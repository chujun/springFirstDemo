package com.chujun.spring.demo.transaction.dao.impl;

import com.chujun.spring.demo.transaction.dao.UserDao;
import com.chujun.spring.demo.transaction.dao.impl.JdbcSpitterDao;
import com.chujun.spring.demo.transaction.domain.User;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chujun on 2015/10/29.
 */
@Repository("userDao")
public class UserDaoJdbcImpl extends JdbcSpitterDao implements UserDao {
    public static final String SQL_INSERT_SPITTER_USER="INSERT INTO  spitter_user (  user_name , password , full_name )VALUES(?,?,?);";
    public static final String SQL_QUERY_GET_USER_BY_ID="SELECT id,user_name,PASSWORD,full_name FROM spitter_user WHERE id=?;";
    public static final String SQL_UPDATE_USER_BY_ID="update spitter_user set user_name = :user_name,password= :password,full_name=:full_name where id =:id;";
    /**
     * 没有SQLException，为Spring自定义的非检查异常（运行时异常）
     * @param spitter
     */
    /*public void addUser(User spitter) {
        this.getSimpleJdbcTemplate().update(SQL_INSERT_SPITTER_USER,spitter.getUserName(),spitter.getPassword(),spitter.getFullName());
    }*/
    public static final String SQL_PARAMETER_INSERT_SPITTER_USER="INSERT INTO  spitter_user (  user_name , password , full_name )" +
            "VALUES(:user_name,:password,:full_name);";
    public int addUser(User spitter) {
        Map params=new HashMap();
        params.put("user_name",spitter.getUserName());
        params.put("password", spitter.getPassword());
        params.put("full_name", spitter.getFullName());
        return this.getSimpleJdbcTemplate().update(SQL_PARAMETER_INSERT_SPITTER_USER, params);
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

    public int updateUser(User user){
        Map params=new HashMap();
        params.put("id",user.getId());
        params.put("user_name",user.getUserName());
        params.put("password", user.getPassword());
        params.put("full_name", user.getFullName());
        return this.getSimpleJdbcTemplate().update(SQL_UPDATE_USER_BY_ID, params);
    }
}
