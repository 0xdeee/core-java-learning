package com.in28mins.oops2.interfaces;

/**
 * @author dstar - Here in this class we implement all the behaviours of the
 *         Game console interface and give implementations based on this class's
 *         requirement we are using the up, down, left, right to move mario.
 *
 */

public class MarioGame implements GameConsole {

	@Override
	public void upButton() {
		System.out.println("Mario Goes Up");
	}

	@Override
	public void downButton() {
		System.out.println("Mario Goes down");

	}

	@Override
	public void leftButton() {
		System.out.println("Mario Goes left");

	}

	@Override
	public void rightButton() {
		System.out.println("Mario Goes right");

	}

}
