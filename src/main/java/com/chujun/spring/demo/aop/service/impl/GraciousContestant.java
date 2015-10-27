package com.chujun.spring.demo.aop.service.impl;

import com.chujun.spring.demo.aop.service.Contestant;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by chujun on 2015/10/26.
 */
public class GraciousContestant implements Contestant {

    public void receiveAward() {
        System.out.println("Why, thank you all very much!");
    }

    public void receiveAward2() {
        System.out.println(this.getClass().getSimpleName()+":receiveAward2");
    }
}
