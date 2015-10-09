/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-8-12
* Description: 
*/
package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.business.SpELExpression;
import com.chujun.spring.demo.first.domain.Ticket;
import com.chujun.spring.demo.first.service.Auditorium;
import com.chujun.spring.demo.first.service.Performer;
import com.chujun.spring.demo.first.service.Stage;
import com.chujun.spring.demo.first.service.impl.Instrumentalist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class IdolSpELExpressionMain {
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-idol-SpEL.xml");
        SpELExpression expression=(SpELExpression)context.getBean("spELExpression");
        printDeclaredField(expression);
    }

    public static void printDeclaredField(Object obj) throws IllegalAccessException {
        Class theClass = obj.getClass();
        Field[] fields = theClass.getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            Object o = field.get(obj);
            Class innerClass=o.getClass();
            //处理数组类型
            if(innerClass.isArray()){
                System.out.println(Arrays.toString((Object[])o));
            }else{
                System.out.println(field.getName()+":"+o);
            }

        }


    }
}
