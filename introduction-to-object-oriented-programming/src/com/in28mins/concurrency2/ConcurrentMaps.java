package com.in28mins.concurrency2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMaps {

	public static void main(String args[]) {

		// previously we have did the same logic in maps section. but to make it thread
		// safe and demo the features in ConcurrentMap class we are doing the same in
		// thread safe way

		// ConcurrentMap provides all the methods in map but with some added features
		// that make the code thread safe..
		// you can see that all the operations in this lines of code are atomic and
		// thread safe
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		System.out.println(occurances);
	}
}
