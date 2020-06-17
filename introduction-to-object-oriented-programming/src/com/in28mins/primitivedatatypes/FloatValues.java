package com.in28mins.primitivedatatypes;

import java.math.BigDecimal;

//using float & double for precision required operations are not advises
//since they can be unpredictable
//so we use BigDecimal Class instead
public class FloatValues {
	public static void main(String[] args) {

		// have to give values inside "" like string
		// if not he values will go unpredictable like 12.123459999999999
		BigDecimal num1 = new BigDecimal("12.12345");
		BigDecimal num2 = new BigDecimal("12.2222");
		BigDecimal x = num1.add(num2);
		System.out.println(x);
		// we can't add other primitive types with this cuz this is a object
		// so we have to wrap the primitives with the object before doing arithmetic
		// operations
		BigDecimal y = num1.add(new BigDecimal(11));
		System.out.println(y);
	}
}
