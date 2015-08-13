package com.chujun.spring.demo.first.service;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by chujun on 2015/8/13.
 * 表演大厅
 */
public class Auditorium implements InitializingBean{
    /**
     * 开灯
     */
    public void turnOnLights() {
        System.out.println(this.getClass().getSimpleName() + "turn on lights");
    }

    /**
     *关灯
     */
    public void turnOffLights() {
        System.out.println(this.getClass().getSimpleName() + "turn off lights");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName()+" implements InitializingBean:afterPropertiesSet method");
    }
}
