package com.syf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {

//	@Pointcut("execution(public * com.syf.dao.impl..*.*(..))")
	@Pointcut("execution(public * com.syf.service..*.add(..))")
	public void myMethod() {
	};

	// @Before("execution(public void
	// com.syf.dao.impl.UserDaoImpl.add(com.syf.model.User))")
	// @Before("execution(public * com.syf.dao.impl..*.*(..))")
	@Before("myMethod()")
	public void before() {
		System.out.println("method start");
	}

	// @After("execution(public * com.syf.dao.impl..*.*(..))")
	@After("myMethod()")
	public void after() {
		System.out.println("method end");
	}

	// @AfterReturning("execution(public * com.syf.dao.impl..*.*(..))")
	@AfterReturning("myMethod()")
	public void afterReturning() {
		System.out.println("method after returning");
	}
	
	@Around("myMethod()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around start method");
		pjp.proceed();
		System.out.println("around end method");

	}

}
