package com.in28mins.exceptionhandling;

class Amounts0 {

	private String currency;
	private int amount;

	public Amounts0(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	// we are throwing out userDefinedExceptinon Class's object to throw a
	// UserDefined Exception
	public void add(Amounts0 that) throws Exception {

		if (!this.currency.equals(that.currency)) {
			throw new CurrencyDoesntMatchException(
					this.currency + " " + that.currency + " " + "Currencies Don't match");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return currency + " " + amount;
	}

}

// creating a class for userDefined Exception, to throw an exception of this
// type we can just throw a object of this class, we can also send message as a
// paramater to display in the console
// since we have extended the Exception class our userDefined Exception became a
// Checked Exception so we have to handle it mandatorily in the calling methods
class CurrencyDoesntMatchException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CurrencyDoesntMatchException(String msg) {
		System.out.println(msg);
	}
}

public class ThrowingAnUserDefinedException {

	public static void main(String[] args) throws Exception {

		Amounts0 amount0 = new Amounts0("USD", 20);
		Amounts0 amount1 = new Amounts0("USD", 10);
		Amounts0 amount2 = new Amounts0("EUR", 30);
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
