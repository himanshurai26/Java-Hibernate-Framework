package com.Hibernate.Embedded.Object;



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
        System.out.println( "Hello World!" );
        
        Configuration conf = new Configuration();
        conf.configure("com/Hibernate/Embedded/Object/embedded.cnf.xml");
        
        try {
       SessionFactory factory = conf.buildSessionFactory();
       
       System.out.print(factory);
       
      Employee emp = new Employee();
      emp.setName("Himanshu Kumar");
      emp.setAge(21);
      emp.setSalary(34000.43);
      
      Address add = new Address();
      add.setPinCode(845449);
      add.setStreet("ITI collony");
      add.setCity("Bettiah");
      add.setState("Bihar");
      emp.setAddress(add);
      
      Employee emp1 = new Employee();
      emp1.setName("Rahul Kumar");
      emp1.setAge(31);
      emp1.setSalary(32000.43);
      
      Address add1 = new Address();
      add1.setPinCode(845344);
      add1.setStreet("Saket 23");
      add1.setCity("New Delhi");
      add1.setState("Delhi");
      emp1.setAddress(add1);
      
      Session session = factory.openSession();
     Transaction tx = session.beginTransaction();
 
     session.save(emp);
     session.save(emp1);
     
     
     
        tx.commit();
      session.close();
      
      factory.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
      
    }
}
