package com.qureshi.demoSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	vehicle obj1= (vehicle) context.getBean("vehicle1");
//    	obj1.drive();
//    	
//    	vehicle obj2= (vehicle) context.getBean("bike");
//    	obj2.drive();
    	
    	Tyre t= (Tyre) context.getBean("tyre");
    	
    	System.out.println(t.toString());
    	
    }
}
