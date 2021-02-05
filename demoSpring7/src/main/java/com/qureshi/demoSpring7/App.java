package com.qureshi.demoSpring7;

import java.util.ArrayList;
import java.util.Arrays;
//import static.java.lang.System.*;
import java.util.regex.Pattern;

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
        System.out.println( "Hello World 7!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Mobile mobile = context.getBean(Mobile.class);
        Processor processor = context.getBean(Processor.class);
        
        mobile.getSnapdragon();
        processor.getProcessorName();
        processor.getProcessorSpeed();
        System.out.println();
        
        Object aValue = null;
        
         String temp1="10.87";
//         int i = Integer.parseInt(temp1);
         
        boolean []arr = new boolean[3];
        char moves[]= {6,5,4,3,10,4,5,3,5,3,1,7};
        char chars[]= {'a','e','d','i','k','n','V','v'};
        int j=0;
        for(char move: moves) {
        	j+=move;
//        	j% =chars.length;
        }
        ArrayList obj = new ArrayList();
//        obj.add("A");
//        obj.ensureCapacity(3);
//        System.out.println("size:"+obj.size());
//        System.out.println(1+2==+3+++5);
//        obj.add("A");
//        obj.add("B");
//        obj.add("C");
//        obj.add(1,"D");
//        System.out.println(obj);
//        int [] a = new int[10];
//        byte [] b = new byte[10];
//        char [] c = new char[10];
//        double [] d = new double[10];
//        System.out.println(a[0]+" "+b[0]+" "+c[0]+" "+d[0]);
//
//    int[] org = new int [] {1,2,3};
//    int[] original = Arrays.copyOf(org,4);
//    int[] copy = Arrays.copyOfRange(original, 0, 4);
//    for(int k=0;k<copy.length;k++ ) {
//    	System.out.println(copy[k]+"");
////    	out.println("ABC");
////    	public static<T> T max(T x,T y) {}

//    	}
//    	int x = 5;{
//    		int y = 6;
//    		 System.out.println(""+x+""+y);
//    }
//        int x = 10;
//        int y =0;
//        for(int z=0;z<5;z++) {
//        	if((++x>2)||(++y>2)) {
//        		x++;
//        	}
//        }
//        System.out.println(x+" " +y);
//        for(int i = 10;i>=x;i--)
//        {
//        	int x = 10-i;
//        	System.out.println(x);
//        }
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9953038949"));
//        System.out.println(Pattern.matches("[789][0-9]{9}","9953038949"));
//        System.out.println(Pattern.matches("[789][0-9]{9}","99530389490"));
//        System.out.println(Pattern.matches("[789][0-9]{9}","6953038949"));
////        System.out.println(Pattern.matches("[789]{1}\\d{9}","8853038949"));
//    int a = 260;
//    byte b =(byte)a;
//    System.out.println(b);
//        System.out.println(1+2==+3+++5+++6+--7);
//        System.out.println(10*20 +"ABC");
//        System.out.println("DEF" + 10*20);
    }
//    static {
//    	int y=7;
////    	System.out.println(""+x+"");
//    }
//    int x=4;
}
