/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: chujun
* Date: 2015-8-12
* Description: 
*/
package com.chujun.spring.demo.first.service.impl;

import org.junit.Test;
import org.mockito.Mockito;

import com.chujun.spring.demo.first.service.Quest;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest(){
		//使用mock对象框架Mockito去创建一个Quest接口的mock实现。
		Quest mockQuest=Mockito.mock(Quest.class);
		
		BraveKnight knight=new BraveKnight(mockQuest);
		
		knight.embarkOnQuest();
		//Mockito框架验证Quest的mock实现的embark方法仅仅被调用了一次。
		Mockito.verify(mockQuest,Mockito.times(1)).embark();
	}
}
