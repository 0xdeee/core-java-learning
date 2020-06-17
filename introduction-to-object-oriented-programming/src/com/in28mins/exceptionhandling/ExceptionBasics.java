package com.in28mins.exceptionhandling;

/**
 * @author dstar - Exception handling is used to show a user friendly message
 *         when an exceptions occurs to make the user understand what the
 *         problem is & it is also used to reigister a stack trace of the
 *         exception so that it will be useful for the person trying to debug
 *         the exception.
 * 
 *         What ever code that we think will cause an exception should be placed
 *         inside try{} block and the catch block will be used to catch that
 *         thrown exception and print the stack trace in the logs.
 * 
 *         Exceptions always throw upwards - If main() call a method1 and it
 *         inturn calls a method2 and the method2 causes an exception it will
 *         look for any exception handling logic in method2 first if its not
 *         there it will throw it to method1 and if method1 also doesn't handle
 *         that exception then it will finally pass it back to main() if
 *         exception handling logic is there it will be handles or the main()
 *         will stop the execution of any further statements and throw a error
 *         and show it in console.
 * 
 *         Exception class Hierarchy - If we think a statement will throw an
 *         exception then we can catch it using either that exception type or
 *         its parent exception type. For example we can catch ArrayOutOfBound
 *         exception in ArrayIndexOutOfBound Class or IndexOutOfBound Class or
 *         RuntimeException Class or Exception Class Exception class is the
 *         parent class of all excetions so we can catch any type of exceptions
 *         with it.
 * 
 */
public class ExceptionBasics {

	public static void simulatingNullPointerException() {
		try {
			String str = null;
			@SuppressWarnings("null")
			int length = str.length();
			System.out.println("simulatingNullPointerException - This method have been executed" + length);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public static void simulatingArrayOutOfBoundsExceptions() {
		try {
			int[] a = { 1, 2, 3 };
			int value = a[4];
			System.out.println("simulatingArrayOutOfBoundsExceptions -This method has been executed" + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		simulatingNullPointerException();
		simulatingArrayOutOfBoundsExceptions();
		System.out.println("End Of Main()");

	}

}
