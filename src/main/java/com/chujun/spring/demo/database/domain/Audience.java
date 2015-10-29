package com.chujun.spring.demo.database.domain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 创建一个POJO类作为切面：观众
 */
@Component()
@Aspect
public class Audience {
    @Pointcut("execution(* com.chujun..aop..service.Performer+.perform(..))")
    /**
     * 定义该切面类级别切点
     */
    public void performance(){
        //这个方法没有实际
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
        //throw new IllegalArgumentException("test");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();
            joinPoint.proceed();
            System.out.println("the perfomance took " + (System.currentTimeMillis() - start) + " milliseconds");
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Boo! We want our money back!");
        }
    }
}
