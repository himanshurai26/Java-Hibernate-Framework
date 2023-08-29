package com.Hibernate.Relationship.Mapping.MTM;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
public static void main(String[] args) {
	
	Configuration conf = new Configuration();
	
	conf.configure("com/Hibernate/Relationship/Mapping/MTM/hibernaterRelationship.MTM.xml");
	
try {
	
	SessionFactory factory = conf.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tnx = session.beginTransaction();
	
	Answer ans1 = new Answer();
	ans1.setAnswername("java is a Programming language");
	ans1.setPostedBy("Himashu kumar");
	
	Answer ans2 = new Answer();
	ans2.setAnswername("Java is plateform independent");
	ans2.setPostedBy("Raja kumar");
	
	Question q1 = new Question();
	q1.setQname("What is Java?");
	ArrayList<Answer> list = new ArrayList<Answer>();
	list.add(ans1);
	list.add(ans2);
	q1.setAnswers(list);
	Answer  ans3 = new Answer();
	ans3.setAnswername("Servlet is an Interface");
	ans3.setPostedBy("Shashank");
	
	Answer ans4 = new Answer();
	ans4.setAnswername("Servlet is an API");
	ans4.setPostedBy("Deepak");
	
	Question q2 = new Question();
	q2.setQname("What is Servlet?");
	
	ArrayList<Answer> list1 = new ArrayList<Answer>();
	
	list1.add(ans3);
	list1.add(ans4);
	q2.setAnswers(list1);
	
session.persist(q1);
session.persist(q2);	
	tnx.commit();
	
	session.close();
System.out.println("Successfully inserted");
	factory.close();
	
}catch(Exception e) {
	e.printStackTrace();
}
}
}
