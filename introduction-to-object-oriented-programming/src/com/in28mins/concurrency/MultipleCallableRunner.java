package com.in28mins.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		// we have seen that running threads using start() doesn't provide option ot run
		// threads in batch...
		// using ExecutorService we can do that. .we can store the threds we want to run
		// in batch in a list and invoke it using ExecutorService object
		List<CallableTask> taskList = List.of(new CallableTask("Space Orphan"), new CallableTask("princess nincompoop"),
				new CallableTask("star lord"), new CallableTask("Princess Consuela Bananahammock"));

		// Here we are running the threads as a batch using invokeAll()
		// Since this is gonna wait till execution of all the threads are done, since
		// its gonna return a
		// list of Future<T> types we are receive it in a List of <Future<T>>
		// NOTE: involeAll() will wait till all the threads are completed an them return
		// the list of Future<T>'s from each and every thread
		List<Future<String>> result = executorService.invokeAll(taskList);

		for (Future<String> element : result) {
			System.out.println(element.get());
		}

		executorService.shutdown();
	}

}
