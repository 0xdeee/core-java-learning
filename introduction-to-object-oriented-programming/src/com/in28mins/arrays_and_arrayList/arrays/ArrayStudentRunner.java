package com.in28mins.arrays_and_arrayList.arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStudentRunner {

	public static void main(String[] args) {

		Student student = new Student("space orphan", new int[] { 99, 98, 99, 100, 97 });
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int minimumMark = student.getMinimumMark();
		int maximumMark = student.getMaximumMark();
		BigDecimal average = student.getAverageMarks();

		System.out.println(number);
		System.out.println(sum);
		System.out.println(minimumMark);
		System.out.println(maximumMark);
		System.out.println(average);
		System.out.println();

		// ***********Array Methods******************

		// similatly there are lot of useful method in Arrays class... all these methods
		// are static
		int[] a = { 2, 5, 4, 6, 7 };
		int[] b = { 5, 2, 6, 7, 4 };

		// compare
		System.out.println(Arrays.compare(a, b));// will compare each index in one array with that same index in the
													// other array, here eventhough both arrays hold the same data but
													// in different order it returns -1, this gives true only if the
													// arrays being compared have same lenght and same element in each
													// index.

		// sort
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.compare(a, b));// comparing after sorting the elements.

		// Fill
		int[] arr = new int[5];// created a array with 5 elements and they don't have any value, will be 0.
		Arrays.fill(arr, 10);// fills all the index in the specified array with given value.
		System.out.println(Arrays.toString(arr));// now all the index will have value 10.
		// there are also hashCode, mismatch, copyOf, parallel sort available.

		// calling static method with variable arguments
		variableSum(1, 2, 3, 4);
		variableSum(1, 2, 3, 4, 5);

		// **************ArrayList************************

		// the problem with arrays are they are fixed and static.
		// meaning if you create an array with 5 elements, then till end it can only
		// have 5 elements
		// there are no inbuilt support for adding or removing elements to array
		// dynamically
		// if we want to add one more element to our array we sould create a new array
		// with size of olderArray size+1 and add the new value and then add the other
		// values to the new array from the old one...
		// similarly for removing element...
		// But, Arraylist provide support to add & remove element dynammically and with
		// much more flexibility.

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(21);
		arrList.add(12);
		arrList.add(33);
		arrList.add(45);
		arrList.add(67);
		System.out.println(arrList.toString());
		arrList.remove(4);
		System.out.println(arrList.toString());

	}

	// ****************Variable Arguments**************

	// sometimes we wouldn't know how many elements we are gonna store in the array
	// if for some case we store 2 elements, 4 for some other and 6 for few etc
	// if we create seperate array 2,4,6 element array, it won't be logical
	// In these scenario we can use variable arguments.
	// syntax of variable arg is datatype followed by "..."
	// the parameter with variable argument must be the last parameter present

	public static void variableSum(int... values) {
		int sum = 0;
		for (int value : values) {
			// things given as variable argument will be auto-converted to array, thats why
			// we were able to use for loop with it.
			sum += value;
		}
		System.out.println(sum);
	}
}
