package com.in28mins.oops2.inhertencebasics;

public class EmployeeRunner {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("space orphan");
		employee.setEmail("spaceorphan@space.in");
		employee.setPhone("123-45-678");
		employee.setTitle("Space Programmer");
		employee.setEmployer("The Space Consultancy Services");
		employee.setEmployeeRating(5);
		employee.setSalary(1000000);
		System.out.println(employee.toString());
	}

}
