package com.mysql.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="news") 
public class News {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String title;
	
	@Column
	private int status;
	
	@Column(name="publish_date")
	@Temporal (TemporalType.DATE)
	private Date publishDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", status=" + status + ", publishDate=" + publishDate + "]";
	}	

}
