package com.in28mins.generics;

import java.util.ArrayList;
import java.util.List;

// Here we are specifying the genetic type of the obejct of the class 
// and we are dynamically gettimg them on runtime into
// this <T> parameter ear the class name 
// Its not mandatory to use T you can use TYPE, E or anything you want 
// but stay consistent with it.
public class MyCustomList<T> {

	// ******** We can also go one step further and do like *************
	// public class MyCustomList<T extends Number>
	// this way the class will accept object of generic type
	// that extends Number class
	// Integer, Float, Double, Long, Byte, Short -> extends Number class
	// so other than these no type will be allowed to create a obj of this class
	// if we use <T extends Number> we won't be able to create obj of type String
	// cuz String class doesn't extend Number class

	// whatever type <?> the main mehtod passes with object creation
	// we assign it to this T in List<T>... so the list becomes of that
	// generic type
	// this way we can use same defenition for any type of elements
	// if List<String> was hardcoded here we will be able to only have string in
	// this list and fot the other integer list in main we would have had to create
	// a new List defenition
	List<T> list = new ArrayList<>();

	// everywhere where we do some operations using that generic type
	// we will use generic rep "T" instead of String or Integer or Double
	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public T getElement(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
