package com.in28mins.concurrency;

// There are two ways to implement multi-threading in Java
// 1. Extend Thread Class
// 2. Implement Runnable Interface

//MultiThreading using Thread Class
class Task1 extends Thread {

	// run is the method in Thread that runs the logic in a seperate thread
	@Override
	public void run() {
		System.out.println("Task 1 started");
		for (int i = 100; i < 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task 1 Ended");
	}
}

//MultiThreading using Runnable Interface
class Task2 implements Runnable {

	// Here also the same run method is used to define logic that needs to be ran
	// concurrently
	@Override
	public void run() {
		System.out.println("Task 2 started");
		for (int i = 200; i < 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task 2 Ended");
	}
}

class Task3 extends Thread {

	@Override
	public void run() {
		System.out.println("Task 3 started");
		for (int i = 300; i < 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task 3 Ended");
	}
}

public class ConcurrencyBasics {

	public static void main(String[] args) throws InterruptedException {

//		----------------------- Typical execution of code ----------------------------------
// Typically our code will execute in order... here the task one will run and
// after that task2 and then task3.. These task doesn't use processing power
// effectively there are some case in which few tasks are supposed tobe runnning
// on the same time but task 1 has some I/O element to it and its waiting fot
// that from user and the execution of task 2 and task 3 is blocked because of
// that... eventhough there are enough resource to run these methods it will
// wait for one task to complete before moving to the next one.
// This is how a Single threaded application works !!!
// But there is a alternative way in Java that allows seperate tasks to run on
// seperate threads in parellel at the same time

		// Task1
		System.out.println("Task 1 started");
		for (int i = 100; i < 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task 1 Ended");

		// Task2
		System.out.println("Task 2 started");
		for (int i = 200; i < 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task 2 Ended");

		// Task 3
		System.out.println("Task 3 started");
		for (int i = 300; i < 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + "Task 3 Ended");

//		Output:

//		Task 1 started
//		100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 
//		Task 1 Ended
//		Task 2 started
//		200 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 
//		Task 2 Ended
//		Task 3 started
//		300 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399 
//		Task 3 Ended

//		----------------------------------------------------------------------------------------

		System.out.println();
		System.out.println();

//		----------------------- Concurrent execution of code -----------------------------------

		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();
		// start is the method that runs the logic in a seperate thread
		System.out.println("Task 1 is getting Kicked off");
		task1.start();

		// When we implement Runnable Interface to run code in threads we can't call
		// start() method directly cuz defenition for start() is in Thread Class only,
		// so we create a Thread class object by passing to constructor the object of
		// class that implements Runnable and through the created Thread class object we
		// call start()
		Thread task2Thread = new Thread(task2);
		System.out.println("Task 2 is getting Kicked off");
		task2Thread.start();

		System.out.println("Task 3 is getting Kicked off");
		task3.start();

//		Output - O/P of code that is running om thread changes on each execution.

//		Task 1 is getting Kicked off
//		Task 2 is getting Kicked off
//		Task 3 is getting Kicked off
//		Task 1 started
//		100 101 102 103 104 105 106 Task 2 started
//		107 200 108 201 109 110 202 111 112 203 113 114 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 115 116 219 220 221 117 222 118 119 223 120 224 121 225 122 226 123 Task 3 started
//		227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 
//		Task 2 Ended
//		124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 300 301 302 303 304 305 306 307 308 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 309 310 311 312 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 313 314 315 316 317 318 319 320 189 190 191 192 193 194 195 196 197 198 199 
//		Task 1 Ended
//		321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399 
//		Task 3 Ended

//		States of the Thread:

		// *NEW - A thred is in NEW state when its object is created ( Thread1 Thread1 =
		// new Thread1()) but the THread Haven't been started (Thread1.start()) yet. It
		// means the thred is ready to run but not started

		// *RUNNABLE - A thread is in Runnable state when it has beem started and its
		// waiting for its turn to get the CPU allocation. Lets take the above O/p...
		// while Task2 is printing 203, Task3 and Task1 are in Runnable State waiting
		// for their turn to get CPU allocation vice versa., while Task1 is printing
		// 110, Task2 & Task3 are in Runnable State.

		// *RUNNING - A thread is in RUNNING state if it has the CPU allocation and is
		// executing in memory, Eg., When 210 is printed Task2 is in Running state, when
		// 350 is printed Task3 is in Running state, When 123 is printed Task1 is in
		// Running State.

		// *BLOCKED/WAITING - A thread is BLOCKED/WAITING when it requires some data
		// from I/O or data from Another Thread and it haven't got the necessary data to
		// continue its execution.

		// *TERMINATED/DEAD - A thread is TERMINATED/DEAD, if it has completed its
		// execution.

//		----------------------------------------------------------------------------------------

//		--------------- Making Task3,4,5 Objects wait till Task1,2,3 are done ------------------

		// I'm running Task 3,4,5 with priority specified but not Task 1,2,3 but if i
		// run them now all threads will execute simultaneously and i won't be able to
		// tell the difference

		// So im making the Thread Task3,4,5 to wait till Task1,2,3 are over
		task1.join();
		task2Thread.join();
		task3.join();

//		----------------------------------------------------------------------------------------

		System.out.println();
		System.out.println();

//		----------------- Concurrent execution of code with Defined Priority -------------------

		// We can use setPriority(inr Priority_value) to specify the priority of threads
		// setting priority doesn't assure that CPU will so this in the order, rather
		// its just a request to CPU to allocate resource to threads with high
		// priority... sometime CPU gives priority to highPriority threads and sometimes
		// doesn't

		// Min Prority is 1, Max Priority is 10, Default Priority is 5
		// we can give any value for priority in 1 to 10 Range.

		Task1 task4 = new Task1();
		Task2 task5 = new Task2();
		Task3 task6 = new Task3();

		System.out.println("Task 4 is getting Kicked off");
		task4.setPriority(1);
		task4.start();

		// to make the thread hold its execution and go to sleep mode for 5 seconds
		Thread.sleep(5000);

		System.out.println("Task 5 is getting Kicked off");
		Thread task5Thread = new Thread(task5);
		task5Thread.setPriority(10);
		task5Thread.start();

		// To make the CPU take back allocated resources for sometime, Its like the
		// thread is saying i had enough processes done take the CPU resource and give
		// it to someother thread.
		// But, its just a request to scheduler and the scheduler can honor this request
		// or don't
		Thread.yield();

		System.out.println("Task 6 is getting Kicked off");
		task6.setPriority(5);
		task6.start();

//		----------------------------------------------------------------------------------------

	}

}
