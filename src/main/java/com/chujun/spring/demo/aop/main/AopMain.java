package com.chujun.spring.demo.aop.main;


import com.chujun.spring.demo.aop.service.impl.PoeticJuggler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/spring-aop.xml");
        PoeticJuggler poeticJuggler=(PoeticJuggler)context.getBean("poeticJuggler");
        poeticJuggler.perform();
    }
}
