package com.demo2.test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Student st = new Student();
//    	Name name = new Name();
//    	name.setFname("fatha");
//    	name.setLname("qureshi");
    	
    	st.setBatchNumber("001");
//    	st.setsName(name);
    	st.setBatchNumber("1");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf= con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
//    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
//    	SessionFactory sf = config.buildSessionFactory();
//    	Session session = sf.openSession();
//    	Transaction tx =session.beginTransaction();
    	
    	session.save(st);
    	tx.commit();
    	
    	
    }
}
