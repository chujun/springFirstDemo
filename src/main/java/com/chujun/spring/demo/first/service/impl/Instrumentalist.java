package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.annotation.StringedInstrument;
import org.springframework.beans.factory.annotation.Autowired;

import com.chujun.spring.demo.first.service.Instrument;
import com.chujun.spring.demo.first.service.Performer;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by chujun on 2015/8/13.
 * 音乐演奏家
 */
public class Instrumentalist implements Performer {
    private String song;
    /**
     * 乐器
     */
    /*@Autowired(required = false)*/
    @Autowired
   /* @Qualifier("piano")*/
    @StringedInstrument
    private Instrument instrument;
    
    private int age;    

    /*@Autowired(required = false)*/
    public Instrumentalist() {
		super();
        System.out.println("call Instrumentalist()");
    }

	public Instrumentalist(Instrument instrument) {
		super();
        System.out.println("call Instrumentalist(Instrument instrument)");
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
