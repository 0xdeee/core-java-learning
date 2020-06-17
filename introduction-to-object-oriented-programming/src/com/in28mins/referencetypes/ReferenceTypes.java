package com.in28mins.referencetypes;

public class ReferenceTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// all the primitive types will be stored in Stack memory (specific for each
		// method)
		// a primitive type variable is a location & it holds it value
		// if you assign one variable to other only the value will be assigned
		int i = 5;
		int j = 6;
		i = j; // not i becomes 6
		j++; // even though j is now 7 the value of i will be same.
		// primitive types
		Reference r1 = new Reference(1);// passing to constructor parameter id
		Reference r2 = new Reference(1);
		// here a new object will be stored in HEAP memory (globally common)
		// the variables r1,r2 will be stored in stack memory
		// but their values in stack memory wont hold the object
		// it will hold the memory location of the object in heap memory
		// since its values is a reference to memory location in HEAP its called
		// REFERENCE TYPE
		Reference r3; // creating a new reference variable in stack memory but its value will be null
		// because we didn't create any object or assign any object to it.
		r3 = r2; // assigning the location of r2 to r3
		r3.id = 5; // i have changed r3's id but the value of r2's id will also change
		// because they both refer to same memory location in HEAP memory
		System.out.println(r1 == r2);// even though they both have same id value "1" it will be false
		// because the value of r1 & r2 are memory locations, since they are separate
		// objects & have separate memory locations
		// they wont be the same.
	}

}
