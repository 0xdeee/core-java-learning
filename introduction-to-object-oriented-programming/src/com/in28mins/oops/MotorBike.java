package com.in28mins.oops;

public class MotorBike {

	private int speed;

	// Obviously java provides default constructor that initializes all member
	// variable to zero
	// but once you provide a user defined constructor, java would revoke its
	// default constructor
	// so you can't create objects like MotorBike x = new MotorBike() cuz the
	// default constructor is missing
	public MotorBike(int speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}

	// so to rectify the above stated problem we should create a manual default
	// constructor
	public MotorBike() {
		// we can leave it empty that is assigns 0 to all member var
		// or
		// call the parameterized constructor from here using "this" keyword
		this(5);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// here we don't want to set a new speed if the passed speed value is zero, so
		// we place some checks for that
		// and set only if the new speed is greater than zero.
		if (speed > 0) {
			this.speed = speed;
		}
	}

	void start() {
		System.out.println("Bike started");
	}

	void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	void decreaseSpeed(int howMuch) {
		// instead of this.speed - howMuch we are calling the set speed method
		// with the new speed value after subtracting the speed decrease becasue
		// we might receive a speed to decrease, if did that the original speed will go
		// negative
		// so we have to check here -> this.speed < howMuch to reduce
		// instead of having a IF here we call setSpeed method where we already
		// implemented an If
		// for similar scenario
		setSpeed(this.speed - howMuch);
	}
}
