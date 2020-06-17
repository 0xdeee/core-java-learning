package com.in28mins.oops2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Crompton", 3.14, "black");
		System.out.println(fan.toString());
		fan.switchOn();
		System.out.println(fan.toString());
		fan.speedDown();
		System.out.println(fan.toString());
		fan.speedUp();
		System.out.println(fan.toString());
		fan.switchOff();
		System.out.println(fan.toString());
	}
}
