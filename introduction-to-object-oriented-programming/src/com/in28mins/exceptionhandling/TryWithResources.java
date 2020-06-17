package com.in28mins.exceptionhandling;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 1, 2, 3, 4, 5 };
			// this is going to throw ArrayIndexOutOfBounds Exception, so the
			// scanner.close() will not be executed and if this particular code is executed
			// for several time this would cause a MEMORY LEAK, we have already seen how to
			// solve it by putting scaner.close() in FINALLY block

			// this is similar but simpler method, in JAVA 7 a new feature is introduced
			// called try with resources, for the things that we need to do a close() like
			// Scanner, Connection etc. we can put then in try() with resources

			// it implements a Closable Interface and it inturn extends AutoClosable
			// Interface, which will close the object in try with resources block incase of
			// exception or even in case of successfull execution
			int number = numbers[21];
			System.out.println(number);
//			scanner.close();
		}

		// ************************************
		// for try with resources alone having a catch or Finally block is optional...
		// for normal try, it is mandatory to have either catch or finally.

	}

}
