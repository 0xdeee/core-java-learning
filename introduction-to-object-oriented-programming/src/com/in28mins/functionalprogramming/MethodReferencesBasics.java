package com.in28mins.functionalprogramming;

import java.util.List;

public class MethodReferencesBasics {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean evenFilter(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		// Regular way
		List.of("Ant", "Bat", "cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));
		System.out.println();

		// Using Method references
		List.of("Ant", "Bat", "cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesBasics::print);
		System.out.println();

		// both the methods would have same output but using method references make the
		// code more simpler and understandable.
		// the syntax is Class_name::Method_name... the appending "()" is not needed
		// while using mehtod referencesc

		Integer max = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);

		System.out.println(max);
		System.out.println();

		// same logic using method References.
		Integer maxWithMethodReferences = List.of(23, 45, 67, 34).stream()
				.filter(MethodReferencesBasics::evenFilter)
				.max(Integer::compare).orElse(0);

		System.out.println(maxWithMethodReferences);
		System.out.println();
	}

}
