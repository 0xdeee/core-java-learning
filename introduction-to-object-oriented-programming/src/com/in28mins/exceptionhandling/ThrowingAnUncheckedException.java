package com.in28mins.exceptionhandling;

class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) {

		// we are checking if the amount objects to be added are of same currency type
		// if not we are throwing an exception using "throw" keyword.
		// for unchecked exception we dont need to specify in method signature that it
		// throws a unchecked exception and it not mandatory to handle it if thrown in
		// the calling function
		if (!this.currency.equals(that.currency)) {
			throw new RuntimeException("Currencies Don't match");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return currency + " " + amount;
	}

}

public class ThrowingAnUncheckedException {

	public static void main(String[] args) {

		Amount amount0 = new Amount("USD", 20);
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 30);
		// this is acceotable because both are in same currency format
		amount0.add(amount1);
		System.out.println(amount0);

		// But this shpuldn't be acceptable because they are in different currecy format
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
