package com.in28mins.oops2.interfaces;

public interface GameConsole {
//	we have to think about interfaces in a different way, like we have a set of actions that many of our different project
//	components are gonna use (behaviour), so instead of defining that behaviour in each and every class we can define those behaviours in an
//	interace and implement them in all the classes that needs those behaviours and give some class specifc implementation logic to those behavious.

// Here we are considering an example of a gaming console, our gaming console has 4 buttons and each game we play with this gaming console
// can implemennt this interface and give a behaviour logic on their own.
	void upButton();

	void downButton();

	void leftButton();

	void rightButton();
}
