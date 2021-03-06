/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-8-11
 * Description: 
 */
package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.service.Knight;
import com.chujun.spring.demo.first.service.Quest;

/**
 * @author chujun 少女营救骑士
 * 只能执行RescueDamselQuest探险任务
 */
public class DamselRescuingKnight implements Knight {
	private Quest quest;

	public DamselRescuingKnight(Quest quest) {
		super();
		//耦合程度高，限制了骑士的探险任务
		this.quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() {		
		quest.embark();
	}

}
