package com.in28mins.arrays_and_arrayList.arrays;

import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getNumberOfMarks() {

		return this.marks.length;
	}

	public int getTotalSumOfMarks() {

		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMinimumMark() {

		int min = marks[0];
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

	public int getMaximumMark() {

		int max = marks[0];
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public BigDecimal getAverageMarks() {

		BigDecimal avg;
		avg = new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()));
		return avg;
	}

	public void addNewMark(int i) {

	}

	public void removeMarkAtIndex(int i) {
		// TODO Auto-generated method stub

	}

}
