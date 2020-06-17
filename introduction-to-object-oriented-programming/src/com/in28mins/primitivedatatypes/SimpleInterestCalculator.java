package com.in28mins.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal, ROI;

	public SimpleInterestCalculator(String principal, String ROI) {
		this.principal = new BigDecimal(principal);
		this.ROI = new BigDecimal(ROI);
	}

	public BigDecimal calculateTotalValues(int term) {
//		this.ROI = ROI.divide(new BigDecimal("100"));
//		BigDecimal SI = principal.multiply(ROI).multiply(new BigDecimal(term));
//		combining Principal + SI formula in one expression
BigDecimal totalValue = this.principal
		.add(principal.multiply(ROI.divide(new BigDecimal("100"))).multiply(new BigDecimal(term)));
		return totalValue;
	}

}
