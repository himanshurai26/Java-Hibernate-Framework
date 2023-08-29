package com.Hibernate.Relationship.Mapping.OTM;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOTOMMtO {
	public static void main(String[] args) {
		System.out.println("Programme Start point.....");
	 	try {
		Configuration conf = new Configuration();
		
		conf.configure("hibernaterRelationship.Mapping.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
//		Author author = new Author();
//		
//		//creating author
//		author.setAuthorId(123);
//	   author.setName("Himanshu Kumar");
//	   
//	   //creation article
//	   
//	   Article article = new Article();
//	   article.setArticleId(21);
//	   article.setTitle("Living in Dark Room");
//	   article.setAuthor(author);
//	   Article article1 = new Article();
//	   
//	   //creatin 2nd article
//	   article1.setArticleId(23);
//	   article.setTitle("We are HopeLess");
//		article1.setAuthor(author);
//		
//		//crearting 3rd article
//		
//	Article article2 = new Article();
//	article2.setArticleId(34);
//	article2.setTitle("Finding Job ??");
//article2.setAuthor(author);		
//		
//List<Article> list = new ArrayList<>();
//
//list.add(article);
//list.add(article1);
//list.add(article2);
		

//// now seeting article to author  one to many mapping
//author.setArticle(list);
// 
Session session  = factory.openSession();
Transaction tnx  = session.beginTransaction();
//
//session.save(author);
//session.save(article);
//session.save(article1);
//session.save(article2);



Author auth = (Author)session.get(Author.class, 123);

System.out.print(auth);

for(Article a : auth.getArticle()) {
	System.out.println(a.getAuthor());
}

tnx.commit();
session.close();


		factory.close();
		System.out.println("Programe End");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
