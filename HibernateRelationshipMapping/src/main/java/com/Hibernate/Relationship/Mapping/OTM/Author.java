package com.Hibernate.Relationship.Mapping.OTM;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@Column(name = "author_id")
	private int authorId;
	private String name;
	
	@OneToMany(mappedBy = "author")
	private List<Article> article;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int authorId, String name, List<Article> article) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.article = article;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

	
}
