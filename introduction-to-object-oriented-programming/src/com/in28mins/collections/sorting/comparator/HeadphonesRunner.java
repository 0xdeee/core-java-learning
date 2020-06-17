/**
 * 
 */
package com.in28mins.collections.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dstar - previously we have seen how to compare list of user defined
 *         type by implenting Comparable interface and defining sort logic in
 *         conpateTo operator, that is a efficient method if we are gonna sort
 *         them by fixed ways like only ascending or only descending. but if we
 *         want to sort them dynamically like ascend or descend and moreover
 *         sort based on fields chosen at runtime we can't use Comparable
 *         interface, it lacks that freedom. Instead we have to use COMPARATOR
 *         interace.
 * 
 *         we can define multiple sort logic in classes implementing comparator
 *         and we can pass the instance of class containing particular sort
 *         logic as an argument to the sort method to choose the type of sorting
 *         you gonna do
 */
public class HeadphonesRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Headphones> templist = List.of(new Headphones("RealMe", "Earbuds", 2000.0, 4.5, 14),
				new Headphones("Samsung", "Level U", 2400.0, 4.2, 12),
				new Headphones("Redmi", "Earbuds sport", 1400.0, 4.0, 8),
				new Headphones("RealMe", "Earbuds pro", 2500.0, 4.7, 16),
				new Headphones("Jabra", "TruelyWireless", 4000.0, 3.6, 4));
		List<Headphones> headphones = new ArrayList<>(templist);
		Collections.sort(headphones, new SortByLowestPrice());// this is the statement that determines basesd on what
																// logic
															// the sorting happens, the type of compartor implemented
															// class object determines how the sorting will happen
		System.out.println(headphones);

		System.out.println();

		Collections.sort(headphones, new SortByHighestPrice());
		System.out.println(headphones);

		System.out.println();

		Collections.sort(headphones, new SortByHighestRating());
		System.out.println(headphones);

		System.out.println();

		Collections.sort(headphones, new SortByHighestBatteryBackup());
		System.out.println(headphones);

	}

}
