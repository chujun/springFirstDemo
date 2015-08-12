/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-8-12
* Description: 
*/
package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.service.Quest;

/**
 * @author chujun
 * 屠龙探险任务
 */
public class SlayDragonQuest implements Quest{

	public void embark() {		
		System.out.println("Slaying Dragon!");
	}

}
