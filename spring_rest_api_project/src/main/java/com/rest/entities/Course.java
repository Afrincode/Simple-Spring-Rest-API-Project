package com.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
	private long id;
	@Column(name = "title", nullable = false)
	private String title;
	
	public Course(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
