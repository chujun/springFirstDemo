package com.chujun.spring.demo.aop.service.impl;

import com.chujun.spring.demo.aop.service.MindReader;
import org.springframework.stereotype.Component;

/**
 * Created by chujun on 2015/10/20.
 */
@Component
public class Magician implements MindReader {
    private String thoughts;
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts=thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
