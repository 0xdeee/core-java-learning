package com.in28mins.functionalprogramming;

import java.util.List;

/* Consider calculating the sum of elements in a list with structural programming vs doing it in Functional programming
 * 
 * In Structual/procedural programming we loop around the list and take element one by one and add it to the Sum variable that 
 * we have created. the value of sum variable will be changing throughout the looping This is called MUTATION
 * Here in structural programming we say WHAT TO DO & HOW TO DO IT.
 * 
 * In Functional Programming, we just say WHAT TO DO by specifying .reduce() and not say HOW TO DO IT cuz it is taken care of implicitly.
 * And Here MUTATION of value of variable sum will not occur
 */

public class FuncProgBasicsExercise {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		System.out.println("Odd elements");
		printOddElements(list);
		System.out.println("Even Elements");
		printEvenElements(list);
		System.out.println("Sum of All Elements");
		sumOfAllElements(list);
		System.out.println("Sum of All Odd Elements");
		sumOfOddElements(list);
		System.out.println("Sum of All Even Elements");
		sumOfEvenElements(list);
		System.out.println();

		// intermediate operations
		// sorted()
		List<Integer> list0 = List.of(4, 2, 90, 2, 1, 4, 45);
		elementsInSortedOrder(list0);
		System.out.println();
		// distinct()
		distinctElements(list0);
		System.out.println();
		// map()
		elementsAsTheirSquares(list0);

	}

	public static void printOddElements(List<Integer> list) {
		list.stream().filter(element -> element.intValue() % 2 != 0).forEach(element -> System.out.println(element));
	}

	public static void printEvenElements(List<Integer> list) {
		// stream() takes a list or some list type data and crate a stream of it like in
		// real life, stream of water... once the stream() gives out the stream of
		// elements in the list. and this stream goes into either a intermediate
		// operation or a terminal operation. Intermaediate operation takes the stream
		// and alters it and returns the altered stream like filter(), sort() etc. but
		// Terminal operation take the stream and return a single o/p like reduce() or
		// consume the whole stream like forEach().
		list.stream().filter(element -> element.intValue() % 2 == 0).forEach(element -> System.out.println(element));
	}

	public static void sumOfAllElements(List<Integer> list) {
		// reduce() is a method that can be used to reduce a list of elements based on
		// some logic.
		// first param tells the intial value its similar to defining sum=0
		// second param is accumulator that defines he login on what basic the reduction
		// of elements will be done here we have given the logic as addition of adjacent
		// numbers so the reduction will be done by adding all elements one by one.
		int sum = list.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
	}

	public static void sumOfOddElements(List<Integer> list) {
		// no need to use element.intValue() for Integer paramter cuz of unBoxing
		// concept
		int sum = list.stream().filter(element -> element % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
	}

	public static void sumOfEvenElements(List<Integer> list) {
		int sum = list.stream().filter(element -> element % 2 == 0).reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
	}

	public static void elementsInSortedOrder(List<Integer> list) {
		// can also pass a comparator obj to the sorted() to alter the type of sort.
		list.stream().sorted().forEach(element -> System.out.println(element));
	}

	public static void distinctElements(List<Integer> list) {
		list.stream().distinct().forEach(element -> System.out.println(element));
	}

	// Map intermediate operator in stream()
	// map is used to map all the element value from previous stream o/p to a
	// particular bussiness logic
	public static void elementsAsTheirSquares(List<Integer> list) {
		list.stream().distinct().map(element -> element * element).forEach(element -> System.out.println(element));
	}
}
