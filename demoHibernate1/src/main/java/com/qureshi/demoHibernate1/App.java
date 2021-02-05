package com.qureshi.demoHibernate1;

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
        System.out.println( "Hello World 1!" );
        Configuration con = new Configuration().configure().addAnnotatedClass(City.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        City city = new City();
        city.setCountryCode("IN");
        city.setDistrict("080");
        city.setName("Bangalore");
        city.setID(01);
        city.setPopulation("10000");
        
        session.save(city);
        tx.commit();
    }
}
