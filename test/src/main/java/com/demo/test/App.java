package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien telusko = new Alien();
    	Employee emp = new Employee();
    	emp.setfName("fatha");
    	emp.setlName("qureshi");
    	telusko.setAid("112");
    	telusko.setAname(emp);
    	telusko.setColor("white");
    	
    	
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf = config.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	Transaction tx =session.beginTransaction();
    	
    	
//    	Alien telusko1 = new Alien();
//    	telusko1 =  (Alien) session.get(Alien.class, "111");

    	session.save(telusko);
//      	System.out.println(telusko1);
    	tx.commit();
    	
    	
  

    }
}
