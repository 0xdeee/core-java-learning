package com.in28mins.exceptionhandling;

class Amounts {

	private String currency;
	private int amount;

	public Amounts(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	// if we are gonna throw a checked exception i.e an exception of class Exception
	// or any other direct subclass of class Exception except Runtime Exception we
	// have to declare in the method signature that it throws such checked
	// exception.
	public void add(Amounts that) throws Exception {

		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies Don't match");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return currency + " " + amount;
	}

}

public class ThrowingAnCheckedException {

	public static void main(String[] args) throws Exception {

		Amounts amount0 = new Amounts("USD", 20);
		Amounts amount1 = new Amounts("USD", 10);
		Amounts amount2 = new Amounts("EUR", 30);
		// this is acceptable because both are in same currency format

		// in this code we are throwing checked exception from add() method so we have
		// to either handle it using trycatch() or throw it.

		// using try catch()
		try {
			amount0.add(amount1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(amount0);

		// But this shouldn't be acceptable because they are in different currecy format

		// using throw
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
