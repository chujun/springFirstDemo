package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.business.SpEL.SpEL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2015/9/8.
 */
public class SpELMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-spel.xml");
        SpEL spEL=(SpEL)context.getBean("SpEL");
        System.out.println(spEL.getCount());
    }
}
