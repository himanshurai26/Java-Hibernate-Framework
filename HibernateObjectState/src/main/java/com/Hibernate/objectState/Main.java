package com.Hibernate.objectState;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		System.out.print("Hello everyOne");
		Configuration conf = new Configuration();
		conf.configure("com/hibernate/objectState/hibernate.objectState.xml");
		try {
			
			SessionFactory factory = conf.buildSessionFactory();
			Session session = factory.openSession();
			Transaction tnx = session.beginTransaction();
			Employee emp = new Employee();
			emp.setName("Shashank Dangi");
			emp.setAge(23);
			
			session.save(emp);
			Employee empl = (Employee)session.get(Employee.class,1);
			System.out.println(empl);
			tnx.commit();
			session.close();
			factory.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}
	}

}
