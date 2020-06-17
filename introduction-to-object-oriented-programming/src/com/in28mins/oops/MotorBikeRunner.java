package com.in28mins.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(10);
		MotorBike aprilla = new MotorBike(10);
		ducati.start();
		aprilla.start();
		ducati.setSpeed(100);
		aprilla.setSpeed(80);
		ducati.increaseSpeed(20);
		ducati.decreaseSpeed(200);
		System.out.println(ducati.getSpeed());
	}

}
