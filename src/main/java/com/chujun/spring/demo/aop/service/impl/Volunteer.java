package com.chujun.spring.demo.aop.service.impl;

import com.chujun.spring.demo.aop.service.Thinker;
import org.springframework.stereotype.Component;

/**
 * Created by chujun on 2015/10/20.
 */
@Component
public class Volunteer implements Thinker {
    private String thoughts;
    public void thoughtSomething(String thoughts) {
        this.thoughts=thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}
