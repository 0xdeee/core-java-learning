/**
 * 
 */
package com.in28mins.oops2.interfaces;

/**
 * @author dstar - This it the class that uses GameConsole and all the classes
 *         that implemented GameConsole.
 *
 */
public class GameRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MarioGame mario = new MarioGame();
		mario.upButton();
		mario.downButton();
		mario.leftButton();
		mario.rightButton();
		System.out.println();
		ChessGame chess = new ChessGame();
		chess.upButton();
		chess.downButton();
		chess.leftButton();
		chess.rightButton();
		System.out.println();
		// We can also go one step further and make it more versatile & loosely couples
		// by doing the following.
		// we are creating object of type GameConsole but intializing it with MarioGame
		// so eventhough it is of type GameConsole it will execue the
		GameConsole game = new MarioGame();
		// if we want to change the implementation to ChessClass then we can just change
		// the constructor call of this game object
		game = new ChessGame();
		game.upButton();
		game.downButton();
		game.leftButton();
		game.rightButton();
	}

}
