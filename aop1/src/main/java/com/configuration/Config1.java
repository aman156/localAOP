package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.concert.Audience;
import com.impl.StageImpl;


/*
 * If your aspect class implements any interface then you have to set proxyTargetClass to true.
 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop-api.html#aop-pfb-proxy-types
 * 
 * If the target class implements one (or more) interfaces, then the type of proxy 
 * that is created depends on the configuration of the ProxyFactoryBean.

  If the proxyTargetClass property of the ProxyFactoryBean has been set to true,
 then a CGLIB-based proxy will be created. This makes sense, and is in keeping with the principle of least surprise. 
 Even if the proxyInterfaces property of the ProxyFactoryBean has been set to one or more fully qualified interface names,
  the fact that the proxyTargetClass property is set to true will cause CGLIB-based proxying to be in effect.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan
public class Config1 {

	@Bean
	public Audience audience()
	{
		System.out.println("111");
		return new Audience();
	}

	@Bean
	public StageImpl stageImpl()
	{
		System.out.println("2122");
		return new StageImpl();
	}
	
}
