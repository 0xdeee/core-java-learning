package com.in28mins.referencetypes;

public class StringBuilderAndBufffer {

	public static void main(String[] args) {
		// String is immutable in JAVA
		String s1 = "asdf";
		String s2 = "jkl;";
		String s3 = "gh";
		String result = s1 + s2 + s3;
		System.out.println(result);
		// here we have appended 3 strings & stored it in a new string
		// because we know s1+s2+s3 is temporary & to use this concatenated string
		// further we have to store it in new string
		// Here totally 4 string object was created right? NO -> 6 objects are created
		// s1+s2 will stored in a x string & x+s3 will be stored in result string
		// in java object creation is not a cheap operation & when you are doing
		// operations like doing this for hundreds of time
		// it will hog the memory
		// so We use STRINGBUFFER or STRINGBUILDER because they are mutable
		// the operations done on them are stored in the same object not on different
		// object like it does with string

		StringBuffer str1 = new StringBuffer("This is a string");// unfortunately here we can't create like string we
																	// have to use the object way.
		str1.append(" this  got appended");
		System.out.println(str1);// you can see that the changes persist even in the next statement.

		// Java also provides StringBuilder class an another mutable string alternative
		// because StringBuffer is a Synchronous class and using it in a non threaded
		// application will slow down the performance
		// If you are not going to use a particular string in threads & you want it
		// mutable then go for StringBuilder.

		StringBuilder str2 = new StringBuilder("This is a StringBuilder");
		System.out.println(str2);
	}

}
