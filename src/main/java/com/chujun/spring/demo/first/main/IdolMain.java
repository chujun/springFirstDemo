/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-8-12
* Description: 
*/
package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.domain.Ticket;
import com.chujun.spring.demo.first.service.Auditorium;
import com.chujun.spring.demo.first.service.Performer;
import com.chujun.spring.demo.first.service.Stage;
import com.chujun.spring.demo.first.service.impl.Instrumentalist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdolMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-idol.xml");
        validateBeanSingleton(context);
        //舞台亮起
        Stage stage = (Stage) context.getBean("oneStage");
        //音乐厅起乐
        Auditorium auditorium = (Auditorium) context.getBean("auditorium");
        System.out.println(auditorium);
        //第一位表演者排练：杂技表演家
        Performer poeticJuggler = (Performer) context.getBean("poeticDuke");
        poeticJuggler.perform();
        //第二位表演者排练:音乐表演家
        Performer instrumentalist = (Performer) context.getBean("kenny");
        instrumentalist.perform();
        //第三位表演者排练:音乐表演家(拥有自己的乐器)
        Performer instrumentalist2 = (Performer) context.getBean("pet");
        instrumentalist2.perform();
        //验证内部类
        System.out.println(((Instrumentalist)instrumentalist).getInstrument()==((Instrumentalist)instrumentalist2).getInstrument());

    }

    public static void validateBeanSingleton(ApplicationContext context) {
        //测试Bean作用域，默认Bean作用域为单例
        Ticket oneTicket = (Ticket) context.getBean("ticket");
        Ticket twoTicket = (Ticket) context.getBean("ticket");
        System.out.println(oneTicket == twoTicket);//true
        //自己new出来的Bean
        Ticket newTicket = new Ticket();
        //自己new出来的bean和spring用getBean中获得单例Bean不是同一个实例
        System.out.println(oneTicket == newTicket);//false
        //一种特殊情况，spring容器声明了两个Ticket
    /*	<!--bean作用域prototype-->
		<bean id="ticket" class="com.chujun.spring.demo.first.domain.Ticket" scope="singleton"></bean>
		<!--Ticket ticket=new Ticket();-->
		<bean id="twoTicket" class="com.chujun.spring.demo.first.domain.Ticket" scope="singleton"></bean>
		<!--Ticket twoTicket=new Ticket();//所以两次声明出来的spring单例Bean不是同一个实例-->*/
        Ticket tTicket = (Ticket) context.getBean("twoTicket");
        System.out.println(oneTicket == tTicket);//false
    }
}
