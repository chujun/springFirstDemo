package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.service.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/8/25 0025.
 */
public class IdolAutowireMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-idol-autowire.xml");
        Performer one= (Performer) context.getBean("one");
        one.perform();
        Performer two= (Performer) context.getBean("two");
        two.perform();
    }
}
