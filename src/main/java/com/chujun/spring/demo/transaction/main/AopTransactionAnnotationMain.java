package com.chujun.spring.demo.transaction.main;


import com.chujun.spring.demo.transaction.domain.User;
import com.chujun.spring.demo.transaction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopTransactionAnnotationMain {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/transaction/spring-transaction-annotation.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = userService.getUserById(33);
        user.setFullName("chujun"+new Date());
        userService.updateUser(user);
        System.out.println(user);
    }
}
