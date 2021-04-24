package com.example.demo.model;

public class User {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String name) {
		this.firstName=name;
	}
	public void setLastName(String name) {
		this.lastName=name;
	}
	
	@Override
	public String toString() {
		String str= (firstName !=null)?firstName+" ":"";
		str +=(lastName !=null )?lastName:"";
		return str.trim();
	}
}
