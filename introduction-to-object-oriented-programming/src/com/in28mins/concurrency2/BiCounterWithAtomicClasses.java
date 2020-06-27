package com.in28mins.concurrency2;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicClasses {

	// this is atomic variable.. they can be used to make a variable thread safe.
	// atomic class mimics the working of ReentrantLock Class
	// there is not only AtomicInteger but there are one Atomic type for all types.
		private AtomicInteger i = new AtomicInteger();
		private AtomicInteger j = new AtomicInteger();

		public int getI() {
			// get() is used to get the value in the atomicInteger reference type so that we
			// can return a int from getter
			return i.get();
		}

		public int getJ() {
			return j.get();
		}

		public void incrementI() {
			i.incrementAndGet();
		}

		public void incrementJ() {
			j.incrementAndGet();
		}

}
