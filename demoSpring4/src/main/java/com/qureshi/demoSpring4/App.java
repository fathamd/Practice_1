package com.qureshi.demoSpring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qureshi.demoSpring4.Library;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World 4!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
        
        Student st = (Student) context.getBean("student");
        st.setBranch("IT");
        st.setName("Fatha");
        st.setRollNum("100");
        
        
        System.out.println(st);
        
        Library lib = (Library) context.getBean("library");
        lib.setBook("Data Structure");
        lib.setRollNum("100");
        System.out.println(lib);
    }
}
