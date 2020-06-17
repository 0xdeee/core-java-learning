/**
 * 
 */
package com.in28mins.collections.mapinterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author dstar - Map is a part of collection framework in java but it doesnot
 *         implement Collection interface in java, It is different from all the
 *         available type of collections
 * 
 *         Here we store in key-value pairs
 * 
 *         HashMap - A Class that implements Map interface, unsorted, unordered,
 *         uses hashCode() to store elements in index,..........................
 *         Allows key with null values <-- IMPORTANT
 * 
 *         HashTable - A Class that implements Map interface, unsorted,
 *         unordered, uses hashCode() to store elements in index, SYNCHRONIZED,
 *         Doesn't allow Key With Null Values <- IMPORTANT
 * 
 *         LinkedHashMap - A class that implements Map interface, Unsorted,
 *         maintains insertion order
 * 
 *         TreeMap - A class that implements Map interface, Sorted Map. since
 *         its a Tree it also implements NavigableMap interface that comes with
 *         few specific utility methods.
 *
 */
public class MapBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ************ Map basic operations *********************************

		Map<Character, Integer> map = Map.of('Z', 5, 'R', 2, 'X', 9, 'A', 4, 'F', 1);

		Map<Character, Integer> hashMap = new HashMap<>(map);
		System.out.println(hashMap);

		Map<Character, Integer> hashTable = new Hashtable<>(map);
		System.out.println(hashTable);

		Map<Character, Integer> linkedHashMap = new LinkedHashMap<>(map);
		System.out.println(linkedHashMap);

		Map<Character, Integer> treeMap = new TreeMap<>(map);
		System.out.println(treeMap);

		System.out.println(hashMap.get('Z'));

		System.out.println(hashMap.put('Z', 21));

		System.out.println(hashMap.containsKey('R'));

		System.out.println(hashMap.containsValue(21));

		System.out.println(hashMap.isEmpty());

		System.out.println(hashMap.size());

		System.out.println(hashMap.remove('Z', 21));

		System.out.println(hashMap.remove('R'));

		System.out.println(hashMap.replace('X', 9, 21));

		System.out.println(hashMap.keySet());

		System.out.println(hashMap.values());

		// ********************************************************************
		System.out.println();
		System.out.println();
		// want to store all the characters in this string as key in map and no.of their
		// occurances as that particular key's value
		String str = "This is an awesome occasion. " + "This has never happened before This ";

		// crating HashMap of Character Key & Integer Value
		Map<Character, Integer> charOccurances = new HashMap<>();

		// converting String to char Array to loop through them
		char[] characters = str.toCharArray();

		for (char character : characters) {

			// a check to find if the current character in loop is " " empty space
			// cuz i don't want it to be counted
			if (character == ' ') {
				continue;
			}

			// Getting the value for the current looped Character Key as integer
			Integer integer = charOccurances.get(character);
			// If its null it means its he first occurance to we add it in the HashMap using
			// put() and intializing the value to 1.
			if (integer == null) {
				charOccurances.put(character, 1);
			}
			// if its not null then we are incrementing the already exsisting value by 1 to
			// mark the increase of occurance of that character
			else {
				charOccurances.put(character, integer + 1);
			}
		}

		System.out.println(charOccurances);
		System.out.println();

		// similarly we are doing for string
		Map<String, Integer> strOccurances = new HashMap<>();

		String[] strings = str.split(" ");
		
		for (String string : strings ) {

			Integer integer = strOccurances.get(string);
			if (integer == null) {
				strOccurances.put(string, 1);
			} else {
				strOccurances.put(string, integer + 1);
			}
		}
		System.out.println(strOccurances);

	}

}
