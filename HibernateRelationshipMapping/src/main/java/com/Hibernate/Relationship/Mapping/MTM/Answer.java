package com.Hibernate.Relationship.Mapping.MTM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String answername;
	private String postedBy;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int id, String answername, String postedBy) {
		super();
		this.id = id;
		this.answername = answername;
		this.postedBy = postedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	

}
