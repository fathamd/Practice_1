package com.qureshi.demoSpring3;

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
        System.out.println( "Hello World 3!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        
        Student st = (Student) context.getBean("std");
        st.setBranch("IT");
        st.setName("Fatha");
        st.setRollNum("100");
        
        Library lib = (Library) context.getBean("lib");
        lib.setBook("Data Structure");
        lib.setRollNum("100");
        
        Book book = (Book) context.getBean("Book");
        System.out.println(book);
        
        Student st1 = (Student) context.getBean("std1");
        System.out.println(st1);
        
        Hostel hos = (Hostel) context.getBean("hostel");
        System.out.println(hos);
        
        System.out.println(st);
        System.out.println(lib);
        
    }
}
