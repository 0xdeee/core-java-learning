package com.in28mins.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	String welcomeMessage;

	public CallableTask(String welcomeMessage) {

		this.welcomeMessage = welcomeMessage;
	}

	@Override
	public String call() throws Exception {
		// Simulating like this method has some complex logic and takes time to execute
		// with sleep()
		Thread.sleep(3000);
		return "Hello, " + welcomeMessage;
	}

}

public class CallableBasics {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		// we are not using execute() cuz we can't call threads that are created using
		// callable inteface from execute()
		// Future is a Generic Type in java it is used to store the value returned form
		// callable thread
		// The thread may execute a complex logic and return programmed value after long
		// time, i.e, in future... this Future type waits for that value and holds the
		// execution.
		// If this call fails it will throw InterruptedException
		Future<String> result = executorService.submit(new CallableTask("Space Orphan"));

		// only after we were able to get value from Future type using get() we can
		// continue to next step of execution or else the control will be held here. and
		// throw ExecutionException and continues with the next
		// statement
		String welcomeMessage = result.get();

		System.out.println(welcomeMessage);


	}

}
