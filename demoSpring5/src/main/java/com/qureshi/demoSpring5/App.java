package com.qureshi.demoSpring5;

import java.io.ObjectInputStream.GetField;
import java.util.Date;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World 5!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Samsung sam = context.getBean(Samsung.class);
        System.out.println(sam);
        sam.config();
        
        
        Date dt = new Date();
        dt = java.util.Calendar.getInstance().getTime();
        Object ob = dt;
        String s = null;
        Object op =   Optional.ofNullable(ob).orElse("");
        String st1 = (String)Optional.ofNullable(op.toString()).get();
        
        String st = (String)Optional.ofNullable(ob.toString()).get();
//        String objectValue = (String) Optional.ofNullable(aValue.toString()).get();
        System.out.println("op:"+op);
        System.out.println("st:"+st);
        System.out.println("st1:"+st1);
        System.out.println("s:"+s);
    }
}
