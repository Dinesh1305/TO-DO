package com.demo.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DoneTask {

@Id
private int id;

private String work;




@Column(name = "created_at", updatable = false)
private Timestamp createdAt;



@CreationTimestamp
@Column(name = "complete_at", updatable = false)
private Timestamp CompleteAt;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getWork() {
	return work;
}

public void setWork(String work) {
	this.work = work;
}

public Timestamp getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Timestamp createdAt) {
	this.createdAt = createdAt;
}
public Timestamp getCompleteAt() {
	return CompleteAt;
}

public void setCompleteAt(Timestamp completeAt) {
	CompleteAt = completeAt;
}




}
