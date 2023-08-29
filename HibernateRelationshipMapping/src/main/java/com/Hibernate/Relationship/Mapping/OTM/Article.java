package com.Hibernate.Relationship.Mapping.OTM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article {
	@Id
	@Column(name = "article_id")
	private int articleId;
	private String title;
	
	@ManyToOne
	private Author author;


	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(int articleId, String title, Author author) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.author = author;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
