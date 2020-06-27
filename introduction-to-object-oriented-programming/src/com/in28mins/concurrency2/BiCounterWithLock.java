package com.in28mins.concurrency2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	// previously we have see why synchronized wont work well for all scenarios...
	// Lock is a feature provided by java.util.concurrent package, it allows to lock
	// a set of code and make it available for only one thread at a time. if a code
	// is in lock while it is accessed by a thread it will wait till the thread that
	// is working on the locked thread to complete its execution.

	// we can also specify the maximum time a thread can wait for a locked thread to
	// get unlocked

	// this is diff from using synchronized because only one sync method can be
	// executed at any point of time by any thread but using locked we can create
	// diff lock obj for code that work on diff values and make the unrelated code
	// available to multiple threads.
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	private int i = 0;
	private int j = 0;

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

}
