package com.chujun.spring.demo.aop.main;


import com.chujun.spring.demo.aop.service.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopAnnotationMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/spring-aop-annotation.xml");
        //两个表演者
        //PoeticJuggler poeticJuggler=(PoeticJuggler)context.getBean("poeticJuggler");
        Performer poeticJuggler=(Performer)context.getBean("poeticJuggler");
       // poeticJuggler.perform();
        System.out.println("next to welcome 2");
        Performer juggler=(Performer)context.getBean("juggler");
        juggler.perform();
        //读心者上台表演
    }
}
