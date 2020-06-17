/**
 * 
 */
package com.in28mins.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dstar - ArrayList is a type of List collections which is built over
 *         Arrays. we developed the need for ArrayList cuz in Arrays we can't
 *         dynamically add values If we need to add new value in an array we
 *         should create a new array and fetch the old elements & add the new
 *         element But ArrayList is not some magic that can add elements
 *         dynamically, It is Built over Array... Instead of you having to
 *         create a new Array and fetch the old elements and insert the new
 *         elements etc... all these work is done implicitly by ArrayList
 *         Collection but in the core ArrayList is just a Array
 * 
 *
 *         In arrays, locating a element based is easy, cuz we can search with
 *         index and find the match quickly, so that infers its also easy to
 *         loacte elements in ArrayList based in index.
 * 
 *         But, As explained earlier using a ArrayList when we need to add and
 *         remove elements from the list multiple times through the course of
 *         execution... cuz adding or removing elements is a resource expensive
 *         operation in Arrays which is ArrayList is built of
 * 
 *         So If you want a list with searching and finding as priority need and
 *         also want the freedom of adding few new elements then go fot
 *         ArrayList But, if you are to be doing add/remove operation frequently
 *         on the list then go for LinkedList
 * 
 *         Vector is also a List type that is built over Arrays... the D/B
 *         ArrayList and Vector is that the latter is Synchronized i.e., Thread
 *         Safe - which also makes Vector slower
 * 
 *         If you dont use your list in many threads simultaneously then go for
 *         ArrayList
 * 
 * 
 */
public class ArrayListBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> royalMintTeam = new ArrayList<String>();
		royalMintTeam.add("Professor");
		royalMintTeam.add("nairobi");
		royalMintTeam.add("denver");
		royalMintTeam.add("tokyo");
		royalMintTeam.add("Rio");
		royalMintTeam.add("Berlin");
		royalMintTeam.add("Moscow");
		System.out.println(royalMintTeam);
		royalMintTeam.add(2, "Helsinki"); // adding elements at a specific index
		System.out.println(royalMintTeam);
		royalMintTeam.remove("Berlin");//we can remove elements based on value
		royalMintTeam.remove(6);// we can remove elements based on index
		System.out.println(royalMintTeam);
		
		List<String> bankOfSpainTeam = List.of("Lisbon", "Stockholm", "Bogota");
		List<String> futureHeistTeam = List.of("Mumbai", "Sydney");
		List<String> allHeistTeam = new ArrayList<String>();
		allHeistTeam.addAll(royalMintTeam);
		allHeistTeam.addAll(bankOfSpainTeam);
		allHeistTeam.addAll(futureHeistTeam);

		System.out.println(allHeistTeam);
		allHeistTeam.set(9, "Chennai");// changing the values in a particular index
		System.out.println(allHeistTeam);

		System.out.println(allHeistTeam.contains("nairobi"));// to check if a particular element is present in the list
																// simiarly there is containsAll(Collection E) method

		System.out.println(allHeistTeam.get(0));// fetchs an element from the given index

		System.out.println(allHeistTeam.indexOf("tokyo"));// gives the index of the particular element
		System.out.println();

		// ***************Iterating through a list*******************
		List<String> words = List.of("Apples", "Bat", "Cat");
		List<String> wordsAl = new ArrayList<>(words);

		// For loop method - If we wanna just loop through the list or find somthing in
		// the list
		// this way is best
		for (String word : words) {
			if (word.endsWith("at")) {
				System.out.println(word);
			}
		}

		// but if we want to iterate through the list and add or remove elements
		// in the list then for loop is not a good option
		// cuz when you are looping through the list and the middle you found your match
		// if you remove the element the for loop iteration will go haywire and give
		// incorrect resutlt, because of size change of list

		// For these cases - ITERATOR method
		Iterator<String> iterator = wordsAl.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println(wordsAl);

		// Summary
		// for just looping through the list - FOR LOOP WAY
		// for adding or removing elements in the list - ITERATOR WAY
		
		//puzzle
		@SuppressWarnings("rawtypes")
		List value = List.of("A", 'a', 1, 0.1); // here we didn't specify generics so any type of element can be stored
												// in this list

		System.out.println(value.get(0) instanceof String);
		System.out.println(value.get(1) instanceof Character);
		System.out.println(value.get(2) instanceof Integer);
		System.out.println(value.get(3) instanceof Double);
		// all will return true cuz when you try to create a list without generic the
		// elements added to it will be autoboxed to its own class type and not the
		// primitive type
		
		//puzzle
		List<Integer> number = List.of(101, 102, 103);
		List<Integer> numberAl = new ArrayList<>(number);// creating array list cuz using List.of() made it immutable
															// and we want to try removing elements

		System.out.println(number.indexOf(101));// eventhough the ip param of indexOf is ana Object type but we gave int
												// value it autoboxes the int value to Integer and search for it in the
												// List
//		numberAl.remove(101);// will give index out of bound exception cuz, in remove there are 2 methods one
								// accept object param and another accept int param. in this line we gave int
								// value to through function overloading it goes to remove method with int param
								// and search for index 101 which by the way is not in list
		numberAl.remove(Integer.valueOf(101));// now thus will go to remove method with Object param cuz we are sending
												// an Object.
		System.out.println(numberAl);
	}

}
