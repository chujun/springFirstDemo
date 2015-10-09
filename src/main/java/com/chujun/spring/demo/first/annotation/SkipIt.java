package com.chujun.spring.demo.first.annotation;
/**
 * Created by chujun on 2015/10/9.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/*@Qualifier*/
public @interface SkipIt {
}
