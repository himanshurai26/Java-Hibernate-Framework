package com.Hibernate.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLExample {
	public static void main(String[] args) {
		
		Configuration cnf = new Configuration();
		
		cnf.configure("com/Hibernate/HQL/hibernate.config.xml");
		
		SessionFactory factory = cnf.buildSessionFactory();

		Session session = factory.openSession();
		
		//HQL
		//syntax
		
//		String query = "from Person where address='kalkaji new delhi'";
		String query = "from Person where address=:x";
		Query  q =session. createQuery(query);
		q.setParameter("x", "ABCD");
		
		//single result = unique result
		// multiple = list
		
		List<Person> list = q.list();
		
		for(Person person : list) {
			System.out.println(person.getName() + " : " + person.getAddress());
		}
		session.close();
		
		factory.close();
		
	}

}
