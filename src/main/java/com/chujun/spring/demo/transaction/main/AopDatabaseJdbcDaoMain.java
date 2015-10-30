package com.chujun.spring.demo.transaction.main;


import com.chujun.spring.demo.transaction.dao.UserDao;
import com.chujun.spring.demo.transaction.domain.User;
import com.chujun.spring.demo.transaction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopDatabaseJdbcDaoMain {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/transaction/spring-transaction.xml");
        //测试dbcp数据库
        UserService userService = (UserService) context.getBean("userService");
        User user = new User("chujun", "1234567", "jackjun"+new Date());
        userService.addUser(user);
        User getedUser = userService.getUserById(33);
        System.out.println(getedUser);
    }
}
