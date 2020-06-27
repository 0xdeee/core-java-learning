package com.in28mins.concurrency2;

public class BiCounter {

	// there is a problem with this approach, even though we are using synced
	// methods to make it thread safe, there are 2 methods here and they operate on
	// different values but using syncronized means only one thread is allowed to
	// execute either of these methods.. example. if thread 1 is exceutinf
	// incrementI() then thread 2 cannot even excute incrementJ()... even though
	// they operate on completely differenet values

	// this causes performace lag

	private int i = 0;
	private int j = 0;

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	synchronized public void incrementI() {
		i++;
	}

	synchronized public void incrementJ() {
		j++;
	}

}
