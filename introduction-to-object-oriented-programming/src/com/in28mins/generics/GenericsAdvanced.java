package com.in28mins.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvanced {

	// Creating generic methods are useful, cuz we can use the same method for any
	// type of elements
	// lets say we want a logic to be executed on multiple types. Its not efficeint
	// to write same logic again and again for all these types
	static <T> T doSomething(T value) {
		return value; // for demostration this methods bussiness logic is just to return the element
						// back with same type
	}

	// an example of generic method for multiple type of List
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static <T extends List> void duplicateList(T list) {
		// we can call this method from only subclasses of List interface
		list.addAll(list);// just append all the elements in the list to the end of the list
		System.out.println(list);
	}

	// wildcards - upperBound
	// List<? extends Number> means it can be a list of any generic type that
	// extends Number Class
	static Number sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	// wildcards - lowerBound
	// List<? super Number> means it can be a list of any generic type that
	// has Number as its SuperClass
	static void addCoupleOfValues(List<? super Number> numbers) {
		// super keyword means all the elements that extends Number
		// can be part of this class
		// super means it allows multiple generic type
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
		System.out.println(numbers);
	}

	public static void main(String[] args) {

		System.out.println(doSomething(1));// works for int
		System.out.println(doSomething("ONE"));// works for String
		System.out.println(doSomething('O'));// for char
		System.out.println(doSomething(1.0));// for double
		System.out.println(doSomething(1l));// for long

		System.out.println();

		List<Integer> list0 = new ArrayList<>(List.of(1, 2, 3));
		duplicateList(list0);// can call this mehtod cuz it imple List interface
		System.out.println(sumOfNumberList(list0));

		System.out.println();

		List<Long> list1 = new LinkedList<>(List.of(4l, 5l, 6l));
		duplicateList(list1);// can call this mehtod cuz it imple List interface
		System.out.println(sumOfNumberList(list1));

		System.out.println();

		List<Number> emptyList = new ArrayList<>();
		addCoupleOfValues(emptyList);
	}

}
