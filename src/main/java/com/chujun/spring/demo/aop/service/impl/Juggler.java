/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-8-12
* Description: 
*/
package com.chujun.spring.demo.aop.service.impl;

import com.chujun.spring.demo.aop.service.Performer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chujun
 * 变戏法者（杂技表演）
 */
@Component
public class Juggler implements Performer{
	
	/**
	 * 豆袋
	 */
	private int beanBags=3;
	
	public Juggler() {
		super();
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
	}

	public int getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}

	public void perform() {
		System.out.println("juggler play with"+beanBags+" beanBags");
	}

}
