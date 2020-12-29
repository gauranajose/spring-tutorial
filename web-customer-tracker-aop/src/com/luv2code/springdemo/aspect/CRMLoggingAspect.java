package com.luv2code.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	// setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	// setup pointcut declarations
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDAOPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
	private void forAppFlow() {}
	
	// add @Before advice
	
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		
		// display method
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("=====>>>> Executing @Before on method: " + theMethod);
		
		// display arguments
		Object[] args = theJoinPoint.getArgs();
		
		for (Object tempArg : args) {
			myLogger.info("=====>>>> Argument: " + tempArg);
		}
	}
	
	// add @After advice
	
	@AfterReturning(
			pointcut = "forAppFlow()",
			returning = "result")
	public void after(JoinPoint theJoinPoint, Object result) {
		
		// display method
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("=====>>>> Executing @After on method: " + theMethod);
		
		// display data returned
		myLogger.info("=====>>>> Returning: " + result);
		
	}
	
	
	
}
