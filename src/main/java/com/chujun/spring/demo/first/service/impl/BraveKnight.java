/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-8-12
 * Description: 
 */
package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.service.Knight;
import com.chujun.spring.demo.first.service.Quest;

/**
 * @author chujun
 * 足够灵活接受各种任何赋予他的探险
 *
 */
public class BraveKnight implements Knight {
	private Quest quest;
		
	public BraveKnight(Quest quest) {
		super();
		//quest被注入进来：构造器注入
		this.quest = quest;
	}

	public void embarkOnQuest() {		
		quest.embark();
	}

}
