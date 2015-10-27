package com.chujun.spring.demo.aop.service;

import com.chujun.spring.demo.aop.service.impl.CriticismEngineImpl;

/**
 * Created by chujun on 2015/10/27.
 */
public aspect JudgeAspect {
    public JudgeAspect(){}

    //injected
    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    pointcut performance() : execution(* perform(..));

    after() returning() :performance(){
        System.out.println(criticismEngine.getCriticism());
    }
}
