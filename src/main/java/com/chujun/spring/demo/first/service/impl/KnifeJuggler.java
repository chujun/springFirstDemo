package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.domain.Knife;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2015/9/2 0002.
 */
public class KnifeJuggler {
    private Set<Knife> knives;
    @Inject
    public KnifeJuggler(Provider<Knife> knifeProvider){
        knives=new HashSet<Knife>();
        for(int i=0;i<5;i++){
            knives.add(knifeProvider.get());
        }
    }
}
