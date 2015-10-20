package com.chujun.spring.demo.aop.service;

/**
 * 表演：读心者
 * Created by chujun on 2015/10/20.
 */
public interface MindReader {
    /**
     * 截听志愿者的内心感应
     * @param thoughts
     */
    public void interceptThoughts(String thoughts);

    /**
     * 显示志愿者所想
     * @return
     */
    public String getThoughts();
}
