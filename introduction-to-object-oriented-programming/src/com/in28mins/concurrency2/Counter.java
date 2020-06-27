package com.in28mins.concurrency2;

public class Counter {

	private int i = 0;

	// lets say we are creating objects for this in CounterRunner class and this
	// increment method is accesses by multiple threads. this will make some errors
	// in the o/p because to make it thread safe we have to make it synchronized
	synchronized public void increment() {

		i++;
		// reason why this code will bug out if accessed by multiple threads because i++
		// is not an atomic operation.

		// 1. first the thread has to get the value of the i
		// 2. the thread have to increment it by 1
		// 3. the thread has to set the new value.

		// lets assume 2 threads are accessing this method and both got the value of
		// i... which is now 0.
		// the thread 1 will increment it to 1 and store it to i... so the i is 1
		// to be a correct o/p thead should increment it by 1 and the i value should
		// become 2
		// but since both threads got i value as 0 and they both will increment it to 1
		// and the o/p will remain as 1

		// this is the problem the comes when non-thread safe methods are used by
		// multiple threads..
		// there are multiple ways to make a method thread, one of it is synchronized
		// it makes it such a way that only once thread is allowed to do execution of a
		// method maked synchronized the other thread which want to execute on the same
		// method should wait till the previous thread is done with the method.. this
		// way not complications will arise
	}

	public int getI() {
		return i;
	}

}
