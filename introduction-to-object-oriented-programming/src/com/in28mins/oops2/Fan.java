package com.in28mins.oops2;

public class Fan {

	// we are doing this from oops perspective
	// building class this way is efficient
	// there are 3 things to determing for creating a object
	// what are their states?
	// what are their behaviours?
	// what are the ways to create an instance(constructor)?

	// Required state of a Fan
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	// these are the minimum req states of a fan

	// when creating a fan object based on this class we can't allow to create obj
	// without value for at least some of the required states
	// in other words, parameterized constructor are a good practice
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	// we can't create a fan in real life without specifying its make, color &
	// radius
	// but we can without knowing its on or its current speed, these 2 are variable
	// states
	// the states which would stay constant for the life of object are best to be
	// intialized in constructor

	// States - what are the function does we want our fan to do.
	// we need getters & setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public byte getSpeed() {
		return speed;
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// Swithching the fan On
	public void switchOn() {
		this.isOn = true;
		this.speed = (byte) 5;// like once the fan is one we want it in this speed means we can set it here
	}

	// Switching the fan Off
	public void switchOff() {
		this.isOn = false;
		this.speed = (byte) 0;// once the fan is stopped its speed should be zero
	}

	// Be able to increare & decrease speed
	public void speedUp() {
		++this.speed;
	}

	public void speedDown() {
		--this.speed;
	}

	// method to print contents of the object
	@Override
	public String toString() {
//		return "Make - " + make + " radius - " + radius + " color - " + color + " isOn? " + isOn + " speed - " + speed;
		// the above statemen has a lot of concat ops which will create lot of unwanted
		// objects, so there is an alternative.
		return String.format("Make - %s, radius - %f, color - %s, isOn? - %b, speed - %d", make, radius, color, isOn,
				speed);
	}
}
