package com.in28mins.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	int taskNumber;

	public Task(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	// run is the method in Thread that runs the logic in a seperate thread
	@Override
	public void run() {
		System.out.println("\n" + "Task " + taskNumber + "started" + "\n");
		for (int i = taskNumber * 100; i < taskNumber * 100 + 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task " + taskNumber + "ended" + "\n");
	}
}

public class ExecutorServiceMultipleThreadRunner {

	public static void main(String[] args) {
		// This determines how many threads will run in parallel

		// For example if i give 2, then task 1 & 2 will run in parellel, once either of
		// 1 or 2 ends task3 will start cuz we are executing 2 threads in parellel. like
		// this always two task will run untill all threads are dead.. this patterns
		// will be followed for n value we give in FixedThreadPool
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));

		executorService.shutdown();
	}

}
