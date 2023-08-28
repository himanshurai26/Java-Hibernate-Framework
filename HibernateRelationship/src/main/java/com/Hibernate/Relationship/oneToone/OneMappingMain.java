package com.Hibernate.Relationship.oneToone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneMappingMain {
	public static void main(String[] args) {
		
		Configuration conf  = new Configuration();
		
		conf.configure("com/Hibernate/Relationship/oneToone/hibernate.relationship.xml");
		
		try {
		SessionFactory factory = conf.buildSessionFactory();
		
		//creating question
		Question question = new Question();
		question.setQuestionId(121);
		question.setQuestion("Which language you are studying.");
		
		
		// creation answer
		Answer answer = new Answer();
		answer.setAnswerId(232);
		answer.setAnswer("I am Learning Java");
	
		question.setAnswer(answer);
		
		//creating question2
				Question question1 = new Question();
				question1.setQuestionId(122);
				question1.setQuestion("Which is your Name");
				
				
				// creation answer2
				Answer answer1= new Answer();
				answer1.setAnswerId(233);
				answer1.setAnswer("My Name is Himanshu Kumar");
			
				question1.setAnswer(answer1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
		//save
		session.save(question);
		session.save(question1);
		
		tx.commit();
		session.close();
		factory.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
