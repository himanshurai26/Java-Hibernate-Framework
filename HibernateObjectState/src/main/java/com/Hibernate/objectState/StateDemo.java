package com.Hibernate.objectState;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
	public static void main(String[] args) {
		//Practical of Hibernate Object States:
		//Transient
		//Persistent
		//Detached
		//Removed
		
		 SessionFactory f  = new Configuration().configure("com/Hibernate/objectState/hibernate.objectState.xml").buildSessionFactory();
		
		 //Creating object
		 Employee emp = new Employee();
		 emp.setName("Deepak");
		 emp.setAge(32);
		 //emp : transient state
		 
		 Session session = f.openSession();
		Transaction tnx =  session.beginTransaction();
		 session.save(emp); 
		 //emp now in : persistent - session, databbase;
	
		 emp.setName("Himanshu");
		 // 
		 
		 tnx.commit();
		 
		 session.close();
		 
		 emp.setName("Nawal");
		 System.out.println(emp);
		 f.close();
	}

}
