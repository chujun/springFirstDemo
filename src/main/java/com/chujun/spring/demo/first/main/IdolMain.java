/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-8-12
* Description: 
*/
package com.chujun.spring.demo.first.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chujun.spring.demo.first.service.Knight;
import com.chujun.spring.demo.first.service.Performer;

public class IdolMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-idol.xml");
		Performer performer =(Performer) context.getBean("poeticDuke");
		performer.perform();
	}
}
