package com.in28mins.collections.sortingbasics;

// in order to be able to sort list of type Employee based on the employee rating we have to implement the Comparable interface
// and override the compareTo() method
public class Employee implements Comparable<Employee> {

	private String name;
	private int rating;

	public Employee(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	// we can use this method to define the sorting logic for type employee
	@Override
	public int compareTo(Employee that) {
//		return Integer.compare(this.rating, that.rating); // for sorting in asceding order
		return Integer.compare(that.rating, this.rating); // for sorting in descending order

		// the ip param is names that as a programming practise, when comparing using
		// compareTo we call the current object as this and the one we compare with as
		// that.

//		public static int compare(int x, int y) {
//	        return (x < y) ? -1 : ((x == y) ? 0 : 1);
//	    }
		// this is the implementation of compare method in Integer class, see the logic
		// now you can understand why the parameter placement alters sort to be
		// ascending & descending

	}

	@Override
	public String toString() {
		return "[" + this.name + " " + this.rating + "]";
	}

}
