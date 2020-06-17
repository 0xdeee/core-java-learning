package com.in28mins.arrays_and_arrayList.arrayslist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Students {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Students(String name, int[] marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	public int getNumberOfMarks() {

		return this.marks.size();
	}

	public int getTotalSumOfMarks() {

		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMinimumMark() {

//		int min = marks.get(0);
//		for (int mark : marks) {
//			if (mark < min) {
//				min = mark;
//			}
//		}
//		return min;
return Collections.min(marks);// using inbuilt method in collections
	}

	public int getMaximumMark() {

//		int max = marks.get(0);
//		for (int mark : marks) {
//			if (mark > max) {
//				max = mark;
//			}
//		}
//		return max;
return Collections.max(marks);// using inbuilt method in collections
	}

	public BigDecimal getAverageMarks() {

		BigDecimal avg;
		avg = new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()));
		return avg;
	}

	public void addNewMark(int i) {
		this.marks.add(i);
	}

	public void removeMark(int i) {
		int index = this.marks.indexOf(i);
		this.marks.remove(index);
	}
}
