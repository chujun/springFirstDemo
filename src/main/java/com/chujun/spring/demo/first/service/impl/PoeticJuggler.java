package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.service.Poem;

/**
 * Created by chujun on 2015/8/13.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

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
