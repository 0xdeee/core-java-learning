package com.in28mins.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnyMultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// we have seen that running threads using start() doesn't provide option ot run
		// threads in batch...
		// using ExecutorService we can do that. .we can store the threds we want to run
		// in batch in a list and invoke it using ExecutorService object
		// This will throw InterruptedException if it fails
		List<CallableTask> taskList = List.of(new CallableTask("Space Orphan"), new CallableTask("princess nincompoop"),
				new CallableTask("star lord"), new CallableTask("Princess Consuela Bananahammock"));

		// we can see running threads in batch and waiting for all the threads in the
		// batch to complete and return a list of Future<T> with
		// MultipleCallableRunner.java
		// Here we are again executing threads as a batch but we are using invokeAny()
		// invokeAny() will return the value of thread that finishes its execution first
		// if we pass 5 logics to run in 5 threads which ever thread completes first,
		// its return value will be sent back
		// Since its only going to send one return we are not cathcing it in a Future<T>
		// or List
		// This wil throw ExecutionException if it fails
		String result = executorService.invokeAny(taskList);

		System.out.println(result);

		executorService.shutdown();
	}


}
