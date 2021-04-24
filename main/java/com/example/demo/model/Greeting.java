package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
public class Greeting {
	@Id
	public String message;
	public long id;

	public Greeting() {
		id=0;
		message="";
	}
	public Greeting(long id,String message) {
		this.id= id;
		this.message= message;
	}
	
	public long getId() {
		return id;
	}
	public String getmessage() {
		return message;
	}
}