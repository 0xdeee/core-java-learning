package com.in28mins.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingBasics {

	public static void main(String[] args) {

		// All this time we have did code in oop way not lets do it in the functional
		// programming way. previously we could pass only object or variable to a
		// function but with functional progrmming
		// 1. we can pass function as a paramter toanother funcion,
		// 2. assign a function as a value to a variable.
		// 3. return a function as a return value from another function
		// which will be useful in multiple scenarios to reduce code and
		// increase speed of execition.

		List<String> list = List.of("Jim", "Pam", "Micheal", "Dwight");
		printBasic(list);
		System.out.println();
		printWithFunctionalProgramming(list);
		// both gives same o/p though their logic is different
		System.out.println();
		// using Filter concept to filer and print specific elements w/o looping.
		printWithFuncProgEndsWithM(list);// printing elements of list that ends with "m"
	}

	// regular old mehtod
	public static void printBasic(List<String> list) {
		for (String element : list) {
			System.out.println(element);
		}
	}

	// new method using functional programming
	public static void printWithFunctionalProgramming(List<String> list) {
		// here we pass a small block of code as a parameter to the forEach() function.
		// thus one aspect of functional programming is used.
		// the small block of code uses another func programming concept called lambda
		// expression.
		list.stream().forEach(element -> System.out.println(element));
	}

	public static void printWithFuncProgEndsWithM(List<String> list) {
		list.stream().filter(element -> element.endsWith("m")).forEach(element -> System.out.println(element));
	}

}
