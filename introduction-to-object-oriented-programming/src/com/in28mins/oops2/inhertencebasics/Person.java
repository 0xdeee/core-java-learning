package com.in28mins.oops2.inhertencebasics;

//this extending Objet class is implicit operataion in java
//Object class is the root of all classes in Java
//A class will either inherit a user defined class or implicitly extends the object class
//this provides lot of method for our class like hashCode(), toString(), etc.
public class Person extends Object {

	private String name;
	private String email;
	private String phone;

	public Person() {
		super();// calls the Object class constructor
		// even if i delete this java will add this default constructor and super() call
		// implicitly.
		System.out.println("Person Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
