package com.ferrina.learn_spring_aop.business.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //on method
@Retention(RetentionPolicy.RUNTIME) //at run time
public @interface TrackTime {

}
