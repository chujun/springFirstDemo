package com.chujun.spring.demo.aop.service;

/**
 * Created by chujun on 2015/10/27.
 */
public aspect JudgeAspect {
    public JudgeAspect(){}

    pointcut performance() : execution(* perform(..));

    after() returning() :performance(){
        System.out.println(criticismEngine.getCriticism());
    }
    //injected
    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
