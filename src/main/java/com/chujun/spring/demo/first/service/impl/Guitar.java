package com.chujun.spring.demo.first.service.impl;

import com.chujun.spring.demo.first.annotation.StringedInstrument;
import com.chujun.spring.demo.first.service.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/8/31 0031.
 *
*/
/*@Qualifier("stringed")*/
@StringedInstrument
@Component
public class Guitar implements Instrument {

	public void play() {		
		System.out.println(this.getClass().getSimpleName()+":Strum strum strum");
	}
}
