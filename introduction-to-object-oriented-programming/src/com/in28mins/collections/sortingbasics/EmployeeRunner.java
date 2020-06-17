/**
 * 
 */
package com.in28mins.collections.sortingbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dstar
 *
 */
public class EmployeeRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = List.of(new Employee("space orphan", 4), new Employee("Dilip", 5),
				new Employee("dstark", 1), new Employee("Kiira", 3));
		List<Employee> employeeAl = new ArrayList<>(employee);
		System.out.println(employeeAl);
		Collections.sort(employeeAl);
		System.out.println(employeeAl);
	}

}
