package com.chujun.spring.demo.aop.service.impl;

import com.chujun.spring.demo.aop.service.Poem;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by chujun on 2015/8/13.
 */
@Component
public class PoeticJuggler extends Juggler {
    @Resource
    private Poem poem;

    public PoeticJuggler(){

    }
    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("While recite...");
        poem.recite();
    }
}
