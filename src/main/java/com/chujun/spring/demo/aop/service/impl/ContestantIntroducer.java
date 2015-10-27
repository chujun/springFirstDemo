package com.chujun.spring.demo.aop.service.impl;

import com.chujun.spring.demo.aop.service.Contestant;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by chujun on 2015/10/27.
 */
@Component
@Aspect
public class ContestantIntroducer {
    @DeclareParents(value="com.chujun.spring.demo.aop.service.Performer+",defaultImpl = GraciousContestant.class)
    private  Contestant contestant;
}
