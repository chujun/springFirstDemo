package com.chujun.spring.demo.aop.main;


import com.chujun.spring.demo.aop.service.MindReader;
import com.chujun.spring.demo.aop.service.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopAnnotationMagicianMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/spring-aop-annotation-magician.xml");
        MindReader reader = (MindReader) context.getBean("magician");
        String thoughts = reader.getThoughts();
        Thinker thinker = (Thinker) context.getBean("volunteer");
        String myThought = "你好";
        thinker.thoughtSomething(myThought);
        System.out.println("thoughts:" + thinker.getThoughts());
        System.out.println(reader.getThoughts() + ":" + myThought.equals(reader.getThoughts()));
    }
}
