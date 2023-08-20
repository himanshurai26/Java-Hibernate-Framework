package com.Hibernate.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	//get and load
	
	Configuration conf = new Configuration();
	conf.configure("com/Hibernate/Annotation/hibernate.config.xml");
	
	SessionFactory factory = conf.buildSessionFactory();
			
	Session session = factory.openSession();
	//get student by id
	
	Address address = (Address)session.get(Address.class, 1);
	//we can use load instead of get
	System.out.println(address);
	
	
	
	
	
	session.close();
	factory.close();
}
}
