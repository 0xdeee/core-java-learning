/**
 * 
 */
package com.in28mins.functionalprogramming;

import java.util.List;
import java.util.Optional;

/**
 * @author dstar - Generally when we do some operations on a stream of values
 *         and our filter condition doesn't exist in our list it eill return
 *         null. but using Null in code is not a good practise cuz it might lead
 *         to null pointer exception
 * 
 *         Lets consider you are creating an api that returns all elements that
 *         is greater than 100 in list but there are no elements that is greater
 *         than 100 in the list. now the consumer of that API will get Null as
 *         response to avoid that we use Optional
 *
 */
public class OptionalBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(
				List.of(21, 23, 27, 29).stream().filter(e -> e % 2 == 1).max((n1, n2) -> Integer.compare(n1, n2)));
		// returns optional[29]

		System.out.println(
				List.of(21, 23, 27, 29).stream().filter(e -> e % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)));
		// returns optional.empty cuz we are filtering for even elements and the list
		// doesn't have one

		// we can use several methods provided by Optinal class to check if the method
		// has returned an element and get them. if it return null i.e optional.empty we
		// can handle it in our own way. its way better than getting
		// NullPointerException

		Optional<Integer> result = List.of(21, 23, 27, 29).stream()
				.filter(e -> e % 2 == 1)
				.max((n1, n2) -> Integer.compare(n1, n2));

		if (result.isPresent()) {
			System.out.println(result.get());
		} else {
			System.out.println("No such element is found");
		}

		// we can also implement the above logic by using a orElse() method

		System.out.println(List.of(21, 23, 27, 29).stream()
				.filter(e -> e % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0));
		// if it didn't go to orElse() part it will automatically return value instead
		// of optional and returns the values 0 if it gets to orElse() part
	}

}
