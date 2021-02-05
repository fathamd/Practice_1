package com.qureshi.demoSpring6;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World 6!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        
        Mobile mobile = context.getBean(Mobile.class);
        mobile.setBrand("Nokia");
        Processor p = context.getBean(Processor.class);
        System.out.println(mobile);
        p.getCPUModel();
        p.getCPUSpeed();
    }
}
