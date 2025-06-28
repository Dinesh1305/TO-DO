package com.demo.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CompleteProblem {

	@Id
	private String name;
	private String url;
	private Timestamp time;
	
	@CreationTimestamp
	private Timestamp complete;
	
	
	
	
	
	
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Timestamp getComplete() {
		return complete;
	}
	public void setComplete(Timestamp complete) {
		this.complete = complete;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
