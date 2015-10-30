package com.chujun.spring.demo.database.main;


import com.chujun.spring.demo.database.dao.UserDao;
import com.chujun.spring.demo.database.domain.User;
import com.chujun.spring.demo.database.service.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopDatabaseJdbcDaoMain {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/database/spring-aop-database.xml");
        //两个表演者
        Performer juggler = (Performer) context.getBean("juggler");
        juggler.perform();
        //测试dbcp数据库
        UserDao spitterUserDao = (UserDao) context.getBean("userJdbcDao");
        User user = new User("chujun", "1234567", "jackjun");
        //find bug:加入中文乱码问题
        System.out.println(user.getUserName());
        spitterUserDao.addSpitter(user);
        User getedUser = spitterUserDao.getUserById(20);
        System.out.println(getedUser);

    }
}
