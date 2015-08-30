package com.chujun.spring.demo.first.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chujun.spring.demo.first.service.Instrument;
import com.chujun.spring.demo.first.service.Performer;

/**
 * Created by chujun on 2015/8/13.
 * 音乐演奏家
 */
public class Instrumentalist implements Performer {
    private String song;
    /**
     * 乐器
     */
    @Autowired(required = false)
    private Instrument instrument;
    
    private int age;    
    
    public Instrumentalist() {
		super();
	}    

    /*@Autowired*/
	public Instrumentalist(Instrument instrument) {
		super();
		this.instrument = instrument;
	}



	public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    /*@Autowired*/
   /* public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }*/
    
    /*@Autowired*/
    public void heresYourInstrument(Instrument instrument){
    	System.out.println("called heresYourInstrument");
    	this.instrument = instrument;
    }

    public void perform() {
        System.out.println("his age:"+age+",Playing " + song + ":");
        instrument.play();
    }
}
