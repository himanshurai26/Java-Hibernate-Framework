package com.Hibernate.Relationship.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	
       Configuration conf = new Configuration();
       
       conf.configure("com/Hibernate/Relationship/Mapping/hibernaterRelationship.Mapping.xml");
       
       try {
    	   
    SessionFactory factory  = conf.buildSessionFactory();
    
    //setting question
    Question q1 = new Question();
    q1.setQuestionId(12);
    q1.setQuestion("What is Programming language");
    
    
   // Seting Answer
    
    Answer ans = new Answer();
    ans.setAnswerId(23);
    ans.setAnswer("Programming language are one  which dealsc with computer");
      ans.setQuestion(q1);
    
    q1.setAnswer(ans);
    
    
    // creating session becouse session has save method 
    Session session = factory.openSession();
    
        Transaction tnx = session.beginTransaction();    
    session.save(q1);
    session.save(ans);
    
    tnx.commit();
     
    
    Question newQ = (Question)session.get(Question.class, 12);
    System.out.println(newQ.getQuestion());
    System.out.println(newQ.getAnswer().getAnswer());
    
    session.close();
    factory.close();
    	   
       }catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
