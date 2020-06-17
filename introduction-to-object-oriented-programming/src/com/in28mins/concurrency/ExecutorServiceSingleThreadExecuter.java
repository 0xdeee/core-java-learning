package com.in28mins.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * When you run thread by itself using thread_class_object.start(), you dont have lot of control in running threads,
 * like which one to start first, which one to run after which one etc. you also have to start() the threads one by one.
 * 
 * But, If you user ExecutorService to run threads you have more control over their executions,
 * you can batch execute threads, return value from threads, set contrains for thread execution
 * like thread 3 can only start after completion of thread 1 or 2..., etc. 
 */
public class ExecutorServiceSingleThreadExecuter {

	public static void main(String[] args) {

		// This is one of the basic features of ExecutorService.
		// newSingleThreadExecutor() executes one thread at a time
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// Executes task1 completely
		executorService.execute(new Task1());// only after the end of task1 it will let task2 start
		// Executes task2 completely
		executorService.execute(new Thread(new Task2()));
		// Because Task3 is in main i.e, Main thread it will run simultaneously with our
		// executor service threads, but the thread 2 will start only after the
		// completion of thread1 cuz they are running in a Single Thread Executer.
		System.out.println("Task 3 is getting Kicked off");
		System.out.println("Task 3 started");
		for (int i = 300; i < 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task 3 Ended");

		executorService.shutdown();
	}

}
