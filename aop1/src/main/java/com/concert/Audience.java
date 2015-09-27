package com.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(* com.concert.Performance.perform(..))")
	public void performance(){}
	
	@Before("performance()")
	public void silenceCellPhones()
	{
		System.out.println("seliencing cell phones..");
	}
	
}
