package com.in28mins.collections.setinterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFeatures {

	public static void main(String[] args) {

		Set<Integer> numbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));

		System.out.println(numbers);

		// return a number lower than the given number. if the given number is in the
		// set, returns the same number
		System.out.println(((TreeSet<Integer>) numbers).floor(34));

		// returns a number lower to the given number from the set
		System.out.println(((TreeSet<Integer>) numbers).lower(34));

		// return a number Higher than the given number. if the given number is in the
		// set, returns the same number
		System.out.println(((TreeSet<Integer>) numbers).ceiling(34));

		// returns a number lower to the given number from the set
		System.out.println(((TreeSet<Integer>) numbers).higher(34));

		// Return the subset of numbers in the given range
		// 1st param in inclusive & 2nd is not inclusive
		System.out.println(((TreeSet<Integer>) numbers).subSet(34, 65));
		// to specify which param should be inclusive
		System.out.println(((TreeSet<Integer>) numbers).subSet(34, true, 65, true));
		System.out.println(((TreeSet<Integer>) numbers).subSet(34, false, 65, false));
		System.out.println(((TreeSet<Integer>) numbers).subSet(34, false, 65, true));

		// returns all elements in set lesser than given element, param not inclusive
		System.out.println(((TreeSet<Integer>) numbers).headSet(54));
		// returns all elements in set greater than given element, param is inclusive
		System.out.println(((TreeSet<Integer>) numbers).tailSet(54));

	}

}
