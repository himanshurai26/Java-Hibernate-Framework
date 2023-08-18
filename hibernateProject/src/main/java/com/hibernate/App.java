package com.hibernate;






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
System.out.println("This is my First project");
System.out.println("Project is Started.....");

Configuration cnf = new Configuration();
cnf.configure("/com/hibernate/hibernate.cfg.xml");

try {
 SessionFactory factory = cnf.buildSessionFactory();
 
	/* System.out.println(factory); */

// creatinh student
Student student = new Student();
student.setId(102);
student.setName("Priyanshu Kumar");
student.setCity("Kolkata");

System.out.println(student);
Session session = factory.openSession();
Transaction tx = session.beginTransaction()
;
session.save(student);

tx.commit();

session.close();
/*;factory.close();
System.out.println(factory.isClosed());*/
}catch(Exception e) {
	e.printStackTrace();
}
    }
}
