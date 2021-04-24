package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
public class Greeting {
	@Id
	public Long id;
	public String message;
	

	public Greeting() {
		id=0L;
		message="";
	}
	public Greeting(Long id,String message) {
		this.id= id;
		this.message= message;
	}
	
	public Long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}