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
	}
}
