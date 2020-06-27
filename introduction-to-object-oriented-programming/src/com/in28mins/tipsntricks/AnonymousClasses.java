package com.in28mins.tipsntricks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClasses {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("thor", "ironman", "captain america", "spider man"));

		// previously we use to create a seperate class for this comparator and pass its
		// object here but using anonymous class we can directly define the logic for
		// the class in the calling place itself.
		// An anonymous class is simply a class without class name
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}

		});
		System.out.println(list);
	}

}
