package com.in28mins.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FuncProgIntermediateOpsExercise  {

	public static void main(String[] args) {

		// prints sqare of first 10 integers
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));
		System.out.println();

		// prints all the elements in the list in lowercase
		List<String> list = List.of("Apple", "Ant", "Bat");
		list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
		System.out.println();

		// prints all the elements in the list as its length
		list.stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	}
}
