package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.service.Instrument;

/**
 * Created by chujun on 2015/8/13.
 * 萨克斯
 */
public class Saxophone implements Instrument {
    public void play() {
        System.out.println(this.getClass().getSimpleName()+":TOOT TOOT TOOT");
    }
}
