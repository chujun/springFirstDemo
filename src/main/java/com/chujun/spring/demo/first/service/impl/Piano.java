package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.annotation.SkipIt;
import com.chujun.spring.demo.first.service.Instrument;

/**
 * Created by chujun on 2015/8/13.
 */
@SkipIt
public class Piano implements Instrument {
    public void play() {
        System.out.println(this.getClass().getSimpleName()+":PLINK PLINK PLINK");
    }
}
