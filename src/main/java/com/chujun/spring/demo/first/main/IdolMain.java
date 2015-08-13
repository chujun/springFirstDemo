/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-8-12
* Description: 
*/
package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.domain.Ticket;
import com.chujun.spring.demo.first.service.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chujun.spring.demo.first.service.Knight;
import com.chujun.spring.demo.first.service.Performer;

public class IdolMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-idol.xml");
		Performer performer =(Performer) context.getBean("poeticDuke");
		performer.perform();
		Stage stage=(Stage)context.getBean("oneStage");
		//测试Bean作用域，默认Bean作用域为单例
		Ticket oneTicket =(Ticket) context.getBean("ticket");
		Ticket twoTicket =(Ticket) context.getBean("ticket");
		System.out.println(oneTicket==twoTicket);//true
		//自己new出来的Bean
		Ticket newTicket=new Ticket();
		//自己new出来的bean和spring用getBean中获得单例Bean不是同一个实例
		System.out.println(oneTicket==newTicket);//false
		//一种特殊情况，spring容器声明了两个Ticket
	/*	<!--bean作用域prototype-->
		<bean id="ticket" class="com.chujun.spring.demo.first.domain.Ticket" scope="singleton"></bean>
		<!--Ticket ticket=new Ticket();-->
		<bean id="twoTicket" class="com.chujun.spring.demo.first.domain.Ticket" scope="singleton"></bean>
		<!--Ticket twoTicket=new Ticket();//所以两次声明出来的spring单例Bean不是同一个实例-->*/
		Ticket tTicket=(Ticket)context.getBean("twoTicket");
		System.out.println(oneTicket==tTicket);//false
	}
}
