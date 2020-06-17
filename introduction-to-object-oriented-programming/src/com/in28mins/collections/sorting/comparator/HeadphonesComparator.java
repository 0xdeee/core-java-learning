/**
 * 
 */
package com.in28mins.collections.sorting.comparator;

import java.util.Comparator;

/**
 * @author dstar - This way we are implementing the Comparator interface we can
 *         define multiple sort logics by creating different classes that
 *         implement the Comaprator interface and giving differet sort logic and
 *         we can use this class to sort the Heaphones list dynamically.
 *
 */

public class HeadphonesComparator {


}

class SortByLowestPrice implements Comparator<Headphones> {

	@Override
	public int compare(Headphones o1, Headphones o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}

class SortByHighestPrice implements Comparator<Headphones> {

	@Override
	public int compare(Headphones o1, Headphones o2) {
		return Double.compare(o2.getPrice(), o1.getPrice());// just switching the param to get the descending sort
	}

}

class SortByHighestRating implements Comparator<Headphones> {

	@Override
	public int compare(Headphones o1, Headphones o2) {
		return Double.compare(o2.getRating(), o1.getRating());
	}

}

class SortByHighestBatteryBackup implements Comparator<Headphones> {

	@Override
	public int compare(Headphones o1, Headphones o2) {
		return Double.compare(o2.getBattery_backup(), o1.getBattery_backup());
	}

}