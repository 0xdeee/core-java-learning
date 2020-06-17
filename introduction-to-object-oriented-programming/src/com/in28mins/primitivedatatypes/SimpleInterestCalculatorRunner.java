package com.in28mins.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");// passing principal & ROI
		BigDecimal totalValue = calculator.calculateTotalValues(5);// passing no of years
		System.out.println(totalValue);
	}

}
