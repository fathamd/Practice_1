package com.qureshi.demoSpring2;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        
//        Employee e1 = (Employee) context.getBean("Employee");
//
//        e1.seteId("101");
//        e1.seteAddress("Bangalore");
//        e1.seteName("fatha");
//        System.out.println("Employee details:"+e1.getDetails());
        
        Employee e2 = (Employee) context.getBean("employee");

        e2.seteId("102");
        e2.seteAddress("mohamed");
        e2.seteName("fatha");
        System.out.println("Employee details:"+e2.getDetails());
        
        Salary e3 = (Salary) context.getBean("salary");
        e3.setTds(101);
        e3.setBasicSal(500.50);
        
        System.out.println("Salary details:"+e2.getDetails());
        Book book = (Book) context.getBean("brand");
        System.out.println("Book:"+ book);
        
        
    }
}
