/**
 * 
 */
package com.in28mins.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author dstar - List is a interface, which all the list type collections will
 *         implement like ArrayList, LinkedList, Vector etc.
 *
 */
public class ListBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// this is the easiest way to create a list, List.of() was introduced in java 9
		// before that we used to create a arraylist, linked list or vector and add
		// values using add()
		// or craate a list from an array...
		List<String> words = List.of("Apples", "carrots", "cats");
		System.out.println(words);// we can just print the List object name it will implicitly call toString and
									// print values not boject location

		// we have several utility methods in List interface.
		System.out.println(words.isEmpty());// to check if list is empty
		System.out.println(words.size());// check the count of elements in the list
		System.out.println(words.contains("cats"));// to find if given element is present in the list
		System.out.println(words.indexOf("carrots"));// to find an element's index

//		words.add("dogs");
//		words.remove("cats");

		// the above statements will throw an exception cuz, eventhough using List.of()
		// method was easy and convenient using that method makes the List IMMUTABLE...
		// we would not want a immutable list, would we?
		// so List.of() is useful for certain scenarios but not when we need to add
		// elements and remove them from our list.
		// so we can opt for ArrayList or LinkedList or Vector

		// creating ArrayList
		List<String> arrayListWords = new ArrayList<String>(words);// creating new array list out of existing "words"
																	// List
		arrayListWords.add("dogs");// not its MUTABLE and we can add elements
		System.out.println(arrayListWords);

		// creating LinkedList
		List<String> linkedListWords = new LinkedList<String>(words);
		linkedListWords.add("dogs");// not its MUTABLE and we can add elements
		System.out.println(linkedListWords);

		// creating LinkedList
		List<String> vectorWords = new Vector<String>(words);
		vectorWords.add("dogs");// not its MUTABLE and we can add elements
		System.out.println(vectorWords);
	}

}
