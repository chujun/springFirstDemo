package com.chujun.spring.demo.aop.service.impl;

import com.chujun.spring.demo.aop.service.MindReader;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by chujun on 2015/10/20.
 */
@Component
@Aspect
public class Magician implements MindReader {
    private String thoughts;

    /**
     * 标识方法作为切点的名称
     * @param thoughts
     */
    //@Pointcut("execution(* com.chujun..aop..service.Thinker+.thoughtSomething(String)) and args(thoughts)")
    //抛出异常：Caused by: java.lang.IllegalArgumentException: error at ::0 formal unbound in pointcut
    @Pointcut("execution(* com.chujun..aop..service.Thinker+.thoughtSomething(String)) && args(thoughts)")
    public void think(String thoughts){
        //System.out.println("think"+thoughts);
    }

    @Before("think(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts=thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
