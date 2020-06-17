package com.in28mins.wrapperclasses;

public class WrapperClassesBasics {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// A wrapper class wraps around a primitive type & gives is a object appearance.
		// Wrapper classes are Final & immutable
		// For each primitive type there is a wrapper class
		// byte->Byte //short->Short //int->Integer //long->Long
		// float->Float //double->Double
		// char->Character //boolean->Boolean

		// ****************Why are they needed?*******************

		// to assign values of other datatype to variables of different type
		// can assign a integer variable an value which is a string
		int i = Integer.valueOf("12345");// 12345 will be stored as integer value
		System.out.println(i);
		boolean flag = Boolean.valueOf("True");
		System.out.println(flag);

		// utility methods such as type conversion
		Float floatWrapper = Float.valueOf(56.78f);
		int value = floatWrapper.intValue();// converts the float value of floatWrapper to int
		System.out.println(value);

		// can convert to other number systems
		Integer intValue = Integer.valueOf("1111", 2);// 2nd parameter represent number system, 2 -> binary
		System.out.println(intValue.toString());

		// also used for storing in collections.

		// *******************Basics******************************

		// In each wrapper class there are two ways of assigning values to the objecs

		// using constructor - got depreciated from JAVA9
		Integer integer0 = new Integer(123);
		Integer integer1 = new Integer(123);

		// using valueOf()
		Integer integer2 = Integer.valueOf(123);
		Integer integer3 = Integer.valueOf(123);

		// all these 4 statements does the same, create a Integer obj & assign value.

		// Diff between constructor method & valueOf() is ->
		// using constructor each object will have seperate memory location in HEAP
		// using valueOf(), while creating a new obj it will see if the value is already
		// there in any HEAP memory
		// if its there it will pass the address of exsisting var with same value... if
		// not exist creates a new one

		System.out.println(integer0 == integer1);// false cuz constructor way stores in diff mem location
		System.out.println(integer2 == integer3);// true cuz integer2 will be created with value "123" while creating
													// integer3 it will look in heap if there's any Integer var with
													// same value, since it there it will pass the integer2's mem loc to
													// integer3 thus they are equal.

		// similarly we can create obj & assign value for other primitives

		// **************AutoBoxing - an Syntactic sugar*****************

		// Java 9 introduces autoboxing & unboxing to ease the way of using wrapper
		// types
		Integer integer4 = 5;// similar to =>Integer integer4 = Integer.valueOf(5);
		// we dont have to write that valueOf() code anymore autoboxing will take care
		// of it.
		System.out.println(integer4);

		// ***************Wrapper Constants******************************

		System.out.println(Integer.SIZE);// size in bits
		System.out.println(Integer.BYTES);// size in bytes
		System.out.println(Integer.MIN_VALUE);// self-explainatory
		System.out.println(Integer.MAX_VALUE);// self-explainatory
	}

}
