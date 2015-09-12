package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.business.SpEL.SpEL;
import com.chujun.spring.demo.first.service.Instrument;
import com.chujun.spring.demo.first.service.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

/**
 * Created by chujun on 2015/9/8.
 */
public class SpELMain {
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-spel.xml");
        SpEL spEL=(SpEL)context.getBean("SpEL");
        Class<? extends SpEL> spELClass = spEL.getClass();
        //反射遍历所有声明的私有域
        for (Field field : spELClass.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(spEL);
            System.out.println(field.getName()+":"+obj);
        }
        //测试
        Performer kenny=(Performer)context.getBean("kenny");
        kenny.perform();

        Performer copyer=(Performer)context.getBean("copyer");
        copyer.perform();
    }
}
