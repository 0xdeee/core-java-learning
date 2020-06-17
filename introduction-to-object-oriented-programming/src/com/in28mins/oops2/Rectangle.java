package com.in28mins.oops2;

public class Rectangle {

	// Another example on how to create a class effectively
	// Always imagine that you are the person that is going to be using this class
	// or API and think of all the things that you will want rearding to the context
	// We are creating a reactange so obviously length & breath are the minimum
	// requires states

	// states
	private int lenght;
	private int breath;

	public Rectangle(int length, int breath) {
		this.lenght = length;
		this.breath = breath;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	// behavious
	// considering for a rectangle, the behavious that are useful for user of this
	// class are finding area & perimeter.

	public int calculateArea() {
		return this.lenght * this.breath;
	}

	public int calculatePerimeter() {
		return 2 * (this.lenght + this.breath);
	}

	@Override
	public String toString() {
		return String.format("Rectangle length - %d, Breath - %d, Area - %d, Perimeter - %d", this.lenght, this.breath,
				this.calculateArea(), this.calculatePerimeter());
	}
}
