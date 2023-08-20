package com.Hibernate.Annotation;



import java.io.FileInputStream;
import java.util.Date;



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
        System.out.println( "Hello every one " );
        System.out.println("Trying to create connection.............");
        
        Configuration conf = new Configuration();
        
        conf.configure("com/Hibernate/Annotation/hibernate.config.xml");
        
        try {
        	SessionFactory factory = conf.buildSessionFactory();
        	
        //	System.out.println(factory);
        	
        	Address address = new Address();
        	
        	address.setStreet("govindpuri kalkaji new delhi");
        	address.setCity("New Delhi");
        	address.setOpen(true);
        	address.setAddedDate(new Date());
        	address.setDirection(432.23);
        	
        	
        	//reading img
        	
        	FileInputStream fis = new FileInputStream("src/main/java/coding.jpg");
        	byte[] data = new byte[fis.available()];
        	fis.read(data);
        	address.setImage(data);
        	
        	
        	Session session = factory.openSession();
        Transaction txt = session.beginTransaction();
        session.save(address);
        
        
        txt.commit();
        
        session.close();
        
        System.out.println("Successfully inserted.......");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
