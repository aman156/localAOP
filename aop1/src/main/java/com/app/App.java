package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Config1;
import com.impl.StageImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World git" );
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
        StageImpl cd = ctx.getBean(StageImpl.class);
        cd.perform();
        
        System.out.println("Test 1");
       
    }
}
