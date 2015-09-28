package com.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience1 {

	@Pointcut("execution(** com.concert.Performance.perform(..))")
	public void point(){}
	
	@Around("point()")
	public void watchPerformance(ProceedingJoinPoint jp)
	{
		try{
		System.out.println("Silencing cell phones");
		System.out.println("Taking seat");
		jp.proceed();
		System.out.println("CLAP CLAP CLAP ");
		
		}catch(Throwable t)
		{
			System.out.println("Demanding the refunds");

		}
	}
}

