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
 */
public class DamselRescuingKnight implements Knight {
	private Quest quest;

	public DamselRescuingKnight(Quest quest) {
		super();
		this.quest = quest;
	}

	public void embarkOnQuest() {		
		quest.embark();
	}

}
