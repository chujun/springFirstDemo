package com.chujun.spring.demo.aop.domain;

import org.springframework.stereotype.Component;

/**
 * 创建一个POJO类作为切面：观众
 */
@Component
public class Audience {
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
        //throw new IllegalArgumentException("test");
    }
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }
}
