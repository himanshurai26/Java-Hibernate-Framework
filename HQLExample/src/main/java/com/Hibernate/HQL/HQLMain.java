package com.Hibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class HQLMain 
{
    public static void main( String[] args )
    {
    	try {
        Configuration conf = new Configuration();
        
        conf.configure("com/Hibernate/HQL/hibernate.config.xml");
        
        SessionFactory factory = conf.buildSessionFactory();
       
        System.out.println(factory);
       
        Session session = factory.openSession();
       Transaction tnx = session.beginTransaction();
       
        //creating object of Person 
       Person person = new  Person();
       person.setName("Himanshu Rai");
       person.setAddress("Kalkaji new Delhi");
       person.setAge(22);
     
       session.save(person);
      
  
   tnx.commit();
    
    
        session.close();
        factory.close();
         	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
