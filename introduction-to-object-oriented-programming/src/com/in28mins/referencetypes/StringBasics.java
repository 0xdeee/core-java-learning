package com.in28mins.referencetypes;

public class StringBasics {


	public static void main(String[] args) {
		// In java string is not a primitive type. but, a reference type
		// the String class in java is used every time we create a string
		String str1 = new String("This is a String"); // Since is a reference type this is how to create a instance
		String str2 = "This is a string literal"; // String Literal creation
		// String is a special class in java that have this facility to create literals
		// String literals are faster than string reference types so its preferred.

		// string class comes with many methods for operations on string

		System.out.println(str1.length());// used to find the length of the given string

		System.out.println(str1.isEmpty());// to check if the string is empty

		System.out.println(str1.charAt(3));// to find the character at the given index of the string
		// there is also setCharAt() method ----------------- (useful)

		System.out.println(str2.substring(10, 16));// to extract a small string from a big string

		char[] charr = str1.toCharArray();// convert a string's content into a character array
		for (char c : charr) {
			System.out.println(c);
		}

		// we can use this to check whether the given substring is present in a main
		// string or not & find their index
		System.out.println(str1.indexOf("is"));// gets the index of first occurrence of the specified string
		System.out.println(str1.indexOf('i'));// gets the index of first occurrence of the specified Character
		// similarly we have lastIndexOf("" or '') to find the index of the occurrence
		// from the end of the string

		// Another way to find if a given substring is present in main string is by
		// using contains method
		System.out.println(str2.contains("literal"));// return true || false but not the index of the search string
														// though

		// to find if a string starts with a certain string
		System.out.println(str2.startsWith("This"));// returns true, here we can also pass another parameter telling the
													// method from where to start the search
		System.out.println(str2.endsWith("literal"));// returns true.

		// to find if given two strings are equal or not
		System.out.println(str1.equals(str2));// returns false
		System.out.println(str1.equalsIgnoreCase(str2));// returns false

		// case change
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

		// concatenate
		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);// when the any side of "+" operator is a string it act as a concatenation
										// operator
		System.out.println("12345" + 123);// this will give 12345123 instead of adding, because one operand is string

		// trim
		String s3 = "       this is going to be trimmed     ";// a literal with unwanted blank space in both sides
		System.out.println(s3.trim());// removes the unwanted blank spaces

		// join
		System.out.println(String.join(",", "A", "B", "C"));// sometimes we would want to add some comma or hyphen after
															// each word
		// in a series of characters there we can use join // its a static method

		// replace
		System.out.println(str1.replace("a", "the"));// I'm going to replace the "a" in the str1 to "the"
		// there's also replaceAll & replaceFirst
	}

}
