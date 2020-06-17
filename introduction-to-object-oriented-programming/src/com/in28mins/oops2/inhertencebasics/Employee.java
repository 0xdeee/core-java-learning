package com.in28mins.oops2.inhertencebasics;

public class Employee extends Person {

	private String title;
	private String employer;
	private int employeeRating;
	private int salary;

	public Employee() {
		super();// even if i delete this java will add default constructor with super() call..
				// whenever we invoke a constructor java automatically adds super() call as the
				// first statement of the constructor so that the parent class's constructor is
				// called before the child class.

		// if the patent class consructor is parameteried then you should pass those
		// constructor values inside super class.
		// eg., super("name", "email@email.com","123-45-678");
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getEmployeeRating() {
		return employeeRating;
	}

	public void setEmployeeRating(int employeeRating) {
		this.employeeRating = employeeRating;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// overriding the toString method from Person class which inherits it from
	// Object class
	@Override
	public String toString() {
		return String.format(
				"Name - [%s]\nemail - [%s]\nphone - [%s]\ntitle - [%s]\nEmployer - [%s]\nEmployeeRating - [%s]\nSalary - [%d]",
				super.getName(), super.getEmail(), super.getPhone(), title, employer, employeeRating, salary);
	}

}
