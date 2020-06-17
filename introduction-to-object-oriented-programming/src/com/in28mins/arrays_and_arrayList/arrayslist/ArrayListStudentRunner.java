package com.in28mins.arrays_and_arrayList.arrayslist;

import java.math.BigDecimal;

public class ArrayListStudentRunner {

	public static void main(String[] args) {
		Students student = new Students("space orphan", new int[] { 99, 98, 99, 100, 77 });
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int minimumMark = student.getMinimumMark();
		int maximumMark = student.getMaximumMark();
		BigDecimal average = student.getAverageMarks();

		System.out.println(number);
		System.out.println(sum);
		System.out.println(minimumMark);
		System.out.println(maximumMark);
		System.out.println(average);
		System.out.println();
		student.addNewMark(101);
		System.out.println(student.getMarks().toString());
		System.out.println();
		student.removeMark(100);
		System.out.println(student.getMarks().toString());

	}

}
