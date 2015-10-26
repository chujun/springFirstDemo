package com.chujun.spring.demo.aop.main;


import com.chujun.spring.demo.aop.service.Contestant;
import com.chujun.spring.demo.aop.service.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2015/10/19.
 */
public class AopDeclareParentMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/spring-aop-declareParent.xml");
        //两个表演者
        //PoeticJuggler poeticJuggler=(PoeticJuggler)context.getBean("poeticJuggler");
        Performer poeticJuggler=(Performer)context.getBean("poeticJuggler");
        poeticJuggler.perform();
        //System.out.println("next to welcome 2");
        Performer juggler=(Performer)context.getBean("juggler");
        //juggler.perform();
        //调用Performer通过引入接口新增的接口
        //((Contestant)poeticJuggler).receiveAward();
        Contestant contestant1=(Contestant)context.getBean("poeticJuggler");
        contestant1.receiveAward();
        contestant1.receiveAward2();
    }


}
