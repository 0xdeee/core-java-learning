package com.in28mins.referencetypes;

public class StringImmutability {

	public static void main(String[] args) {

		String s1 = "this is string 1";
		System.out.println(s1.concat(" This will be concatenated in the end"));// it will print the s1 with the
																				// concatenated string
		System.out.println(s1);// it will be "this is string1" even though in previous statement we have
								// appended it
		// this is because String is immutable in java...
		// once a string is given a value it can never be changed
	}

}