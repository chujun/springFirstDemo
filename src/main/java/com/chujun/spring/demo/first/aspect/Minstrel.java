/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-8-12
 * Description: 
 */
package com.chujun.spring.demo.first.aspect;

/**
 * @author chujun 游吟诗人
 */
public class Minstrel {

	/**
	 * 探险前吟唱
	 */
	public void singBeforeQuest() { // <co id="co_singBefore"/>
		System.out.println("Fa la la; The knight is so brave!");
	}

	/**
	 * 探险后吟唱
	 */
	public void singAfterQuest() { // <co id="co_singAfter"/>
		System.out.println("Tee hee he; The brave knight did embark on a quest!");
	}
}
