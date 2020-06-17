/**
 * 
 */
package com.in28mins.collections.mapinterface;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author dstar - in the class that implement Map interface this TreeMap class
 *         is different cuz it also implements NavigableMap interface which
 *         provides somes special set of functions
 *
 */
public class TreeMapBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Character, Integer> treeMap = new TreeMap<>();

		treeMap.put('F', 25);
		treeMap.put('Z', 5);
		treeMap.put('L', 250);
		treeMap.put('A', 15);
		treeMap.put('B', 25);
		treeMap.put('G', 25);

		System.out.println(treeMap); // Auto sorted based on key cuz its Tree DS
		System.out.println();

		System.out.println(((TreeMap<Character, Integer>) treeMap).higherKey('F'));
		System.out.println(((TreeMap<Character, Integer>) treeMap).ceilingKey('F'));
		System.out.println(((TreeMap<Character, Integer>) treeMap).lowerKey('F'));
		System.out.println(((TreeMap<Character, Integer>) treeMap).floorKey('F'));

		System.out.println(((TreeMap<Character, Integer>) treeMap).firstKey());
		System.out.println(((TreeMap<Character, Integer>) treeMap).lastKey());

		System.out.println(((TreeMap<Character, Integer>) treeMap).firstEntry());
		System.out.println(((TreeMap<Character, Integer>) treeMap).lastEntry());

		System.out.println(((TreeMap<Character, Integer>) treeMap).subMap('F', 'L')); // first param is inclusive second
																						// is not

		System.out.println(((TreeMap<Character, Integer>) treeMap).subMap('F', true, 'L', true)); // making both
																									// inclusive

	}

}
