/**
 * 
 */
package com.in28mins.oops2.interfaces;

/**
 * @author dstar - Here we are implementing the GameConsole interface & giving
 *         implementation login for our ChessGame class by using the up, doen,
 *         left, right to move the chess pieces in the board.
 * 
 *
 */
public class ChessGame implements GameConsole {

	@Override
	public void upButton() {
		System.out.println("Moving piece up");
	}

	@Override
	public void downButton() {
		System.out.println("Moving piece down");

	}

	@Override
	public void leftButton() {
		System.out.println("Moving piece left");

	}

	@Override
	public void rightButton() {
		System.out.println("Moving piece right");

	}

}
