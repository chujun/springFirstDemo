package com.chujun.spring.demo.first.main;

import com.chujun.spring.demo.first.service.Instrument;
import com.chujun.spring.demo.first.service.Knight;
import com.chujun.spring.demo.first.service.Performer;
import com.chujun.spring.demo.first.service.impl.BraveKnight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2015/10/9.
 */
public class IdolComponentScanConfigurationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-idol-component-scan-configuration.xml");
        Instrument one = (Instrument) context.getBean("guitar");
        one.play();
        //引用JavaConfiguration类中@Bean申明的Spring Bean
        Performer juggler=(Performer)context.getBean("juggler");
        juggler.perform();

        Performer juggler15=(Performer)context.getBean("juggler15");
        juggler15.perform();

        Knight knight=(BraveKnight)context.getBean("braveKnight");
        knight.embarkOnQuest();
    }
}
