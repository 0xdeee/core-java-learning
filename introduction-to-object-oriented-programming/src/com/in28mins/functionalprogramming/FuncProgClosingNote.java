package com.in28mins.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class FuncProgClosingNote {

	public static void main(String[] args) {

		// 1. we can pass function as a paramter to another funcion:

		List.of(22, 35, 67, 88).stream().filter(evenPredicate()).forEach(n -> System.out.println(n));
		System.out.println();

		// 2. assign a function as a value to a variable.

		// like this if we have needed function defenition assigned to variable we can
		// swap it out are arrive at different o/p in filter()
		final Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;
		final Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;
		List.of(22, 35, 67, 88).stream().filter(evenPredicate).forEach(n -> System.out.println(n));
		System.out.println();
		List.of(22, 35, 67, 88).stream().filter(oddPredicate).forEach(n -> System.out.println(n));
		System.out.println();

		// 3. return a function as a return value from another function

		List.of(22, 35, 67, 88).stream().filter(evenPredicate()).forEach(n -> System.out.println(n));
		System.out.println();
		List.of(22, 35, 67, 88).stream().filter(oddPredicate()).forEach(n -> System.out.println(n));
		System.out.println();
	}

	// these methods return function as a return value
	public static Predicate<? super Integer> evenPredicate() {
		return n -> n % 2 == 0;
	}

	public static Predicate<? super Integer> oddPredicate() {
		return n -> n % 2 == 1;
	}

}
