/**
 * 
 */
package com.in28mins.collections.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author dstar - there are 3 classes implementing Set interface in java they
 *         are HashSet, LinkedHashSet & TreeSet.
 * 
 *         In All these 3 classes we can't store duplicate values or
 *         insert/delete/update/add elements based on index.
 * 
 *         HashSet - Does not maintain insertion order, does not sort
 * 
 *         LinkedHashSet - Does maintain insertion order, does not sort
 * 
 *         TreeSet - Does not maintain insertion order, Does sort
 *
 */
public class SetBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// 3rd best efficient Set to store elements
		Set<Character> charSet = new TreeSet<>(characters);
		System.out.println(charSet);// printing the characters list with only unique elements in a sorted way

		// 2nd best efficient set to store elements
		Set<Character> linkedCharSet = new LinkedHashSet<>(characters);
		System.out.println(linkedCharSet);// printing the characters list with unique elements in same order as
											// insertion order

		// Most efficient way to sore elements but does not maintain insertion order
		// If you don't care about order then go for this always
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println(hashSet);// printing the characters list with unique elements in order not as
									// same as insertion order
	}

}
