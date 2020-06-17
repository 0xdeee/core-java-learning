/**
 * 
 */
package com.in28mins.generics;

/**
 * @author dstar - Generics allows you to use a list object to determing its
 *         generic type in runtime.
 *
 */
public class GenericsBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Here we were able to create the list MyCustomList with <String> & <Integer>
		// but without haivng
		// to crate new code for these two objects, we use same class defenition with
		// generics to serve these
		// two object cresations with different types.

		MyCustomList<String> list0 = new MyCustomList<>();
		list0.addElement("Element0");
		list0.addElement("Element1");
		list0.addElement("Element2");
		list0.addElement("Element3");
		System.out.println(list0);
		System.out.println(list0.getElement(2));

		System.out.println();

		MyCustomList<Integer> list1 = new MyCustomList<>();
		list1.addElement(Integer.valueOf(11));
		list1.addElement(Integer.valueOf(12));
		list1.addElement(Integer.valueOf(13));
		list1.addElement(Integer.valueOf(14));
		System.out.println(list1);
		System.out.println(list1.getElement(1));
	}

}
