package com.chujun.spring.demo.aop.service;

/**
 * 竞争者关注
 * 表演者接口的引入接口
 * Created by chujun on 2015/10/26.
 */
public interface Contestant {
    public void receiveAward();

    public void receiveAward2();
}
