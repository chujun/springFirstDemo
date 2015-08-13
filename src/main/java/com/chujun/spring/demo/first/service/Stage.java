package com.chujun.spring.demo.first.service;

/**
 * Created by chujun on 2015/8/13.
 * 单例舞台：
 * 静态工厂模式：处于线程安全考虑，采用了initialization on demand holder技术创建单例
 */
public class Stage {
    public Stage() {
    }
    private static class StageSingletonHolder{
        //延时加载实例
        static Stage instance=new Stage();
    }
    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
