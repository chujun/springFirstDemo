package com.chujun.spring.demo.first;

import com.chujun.spring.demo.first.service.Quest;
import com.chujun.spring.demo.first.service.impl.BraveKnight;
import com.chujun.spring.demo.first.service.impl.Juggler;
import com.chujun.spring.demo.first.service.impl.RescueDamselQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chujun on 2015/10/16.
 */
@Configuration
public class JavaConfiguration {
    //申明Spring Bean
    @Bean
    public Juggler juggler(){
        return new Juggler();
    }

    //注入普通属性
    @Bean
    public Juggler juggler15(){
        return new Juggler(15);
    }

    @Bean
    public Juggler juggler16(){
        Juggler juggler=new Juggler();
        juggler.setBeanBags(16);
        return juggler;
    }

    @Bean
    public Quest rescueDamselQuest(){
        return new RescueDamselQuest();
    }
    @Bean
    //注入Bean引用
    public BraveKnight braveKnight(){
        return new BraveKnight(rescueDamselQuest());
    }
}
