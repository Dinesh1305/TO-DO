package com.demo.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tasks {
@Id
@GeneratedValue
private int id;

private String work;


@CreationTimestamp
@Column(name = "created_at", updatable = false)
private Timestamp createdAt;


public Timestamp getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Timestamp createdAt) {
	this.createdAt = createdAt;
}

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



@Override
public String toString() {
	return "Tasks [id=" + id + ", work=" + work + "]";
}



}
