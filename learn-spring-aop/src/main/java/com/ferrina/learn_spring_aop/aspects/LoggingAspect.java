package com.ferrina.learn_spring_aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//@Before("execution(com.ferrina.learn_spring_aop.data.*.*.*(...))")
	@Before("execution(* com.ferrina.learn_spring_aop.business.*.*(..))")
	private void method(JoinPoint joinPoint)
	{
		logger.info("Before Aspect-Method claled is = {}",joinPoint);
	}
	@AfterReturning(pointcut = "execution(* com.ferrina.learn_spring_aop.business.*.*(..))",returning ="value")
	private void method1(JoinPoint joinPoint,Object value)
	{
		logger.info("after Aspect-Method claled is = {} & {}",joinPoint,value);
	}
}
