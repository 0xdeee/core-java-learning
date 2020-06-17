package com.in28mins.collections.sortingbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = List.of(4, 3, 9, 1);
		List<Integer> numberList = new ArrayList<>(number);
		Collections.sort(numberList);
		System.out.println(numberList);
		List<String> name = List.of("ball", "cat", "apple", "zebra");
		List<String> nameList = new ArrayList<>(name);
		Collections.sort(nameList);
		System.out.println(nameList);

		// This type of effort free sorting is possible cuz of "Comaprable Interface"
		// All these Integer, String, Double they already inherit Comaparable interface.
		// so that this operation is possible...
		// these classes implemented the Comparable interface and defined the
		// compareTo() method based on their own log

		// But we cant sort our list which is of user defined datatype
		// cuz these classes wouldn't have implemented Comaprable interface
		// inorder to be able to sort a list of user defined class
		// implement Comparable interface, define the CompareTo() method
		// define the logic such that comapring specific fields in the class
		// you want the comparision to happen
	}

}
