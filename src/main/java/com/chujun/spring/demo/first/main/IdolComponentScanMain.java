package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.service.Instrument;
import com.chujun.spring.demo.first.service.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2015/10/9.
 */
public class IdolComponentScanMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-idol-component-scan.xml");
        Instrument one = (Instrument) context.getBean("guitar");
        one.play();
        //这个eddieBean没有继承Instrument，而是使用了@Component("eddie")注解Instrumentalist继承Performer这个类
        Performer performer=(Performer)context.getBean("eddie");
        performer.perform();
        //测试@SkipIt注解
        Instrument two = (Instrument) context.getBean("piano");
        two.play();
    }
}
