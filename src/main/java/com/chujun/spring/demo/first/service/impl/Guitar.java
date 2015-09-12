package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.annotation.StringedInstrument;
import com.chujun.spring.demo.first.service.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Administrator on 2015/8/31 0031.
 *
*/
/*@Qualifier("stringed")*/
@StringedInstrument
public class Guitar implements Instrument {

	public void play() {		
		System.out.println(this.getClass().getSimpleName()+":Strum strum strum");
	}
}
