package com.in28mins.exceptionhandling;

/**
 * @author dstar
 * 
 *         Exception is a super class of either Error Class or RuntimeException
 *         class(Unchecked Exceptions) or CheckedException Classes
 * 
 *         Error - This is a type of exception that we cant do much about this
 *         will be thrown due to JVM failure, Stack OverFlow, Etc.
 * 
 *         Unchecked Exception - This include Runtime Exception class and all
 *         its sub classes. if we specify a method throws a unChecked Exception
 *         then is not mandatory for us to handle it in the calling
 *         method.(Optional to be handled or throw)
 * 
 *         Checked Exception - These are direct subclasses of Exception Class
 *         and if a statement throws a checked Exception we have to either
 *         handle it like in method1() or throw it like in method2() and handle
 *         it mandatorily in calling mehthod which in this case is main() (Must
 *         be handled or must throw to calling method)
 *
 */
public class CheckedVsUncheckedExceptions {

	public static void method1() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void method2() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void method3() throws RuntimeException {
		System.out.println("method 3");
	}

	public static void main(String[] args) {
		method1();
		try {
			method2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		method3();
	}

}
