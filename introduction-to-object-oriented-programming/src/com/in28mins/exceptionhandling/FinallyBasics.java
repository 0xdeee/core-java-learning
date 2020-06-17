package com.in28mins.exceptionhandling;

import java.util.Scanner;

public class FinallyBasics {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scanner = null;
		try{

			scanner = new Scanner(System.in);
			int[] numbers = { 1, 2, 3, 4, 5 };
			int number = numbers[6];

			// we are opening a scanner object here, but in the previous line an exception
			// will occur and the next statement will not be executed, so the scanner will
			// not close

			// If its just a single instance its probable fine, but if this logic be called
			// 100s of times and out of that it causes and exception for 50 times and failed
			// to close scanner object then it will cause a huge MEMORY LEAK

			// to solve this problem we have finally block

//			scanner.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			// Finally is a block that will execute either exception occurs or doesn't.
			// Is is used to do some postprocessing works such as closing any memory
			// consuming objects like scanner, JDBC connection, File Reader Streams etc.

			// Here we are performing a null check for scanner cuz the is chance that
			// exceptions occurs while creating scanner and the scanner was left to be null,
			// so we dont have to close a null object right.. thats why we are performing a
			// null check and closing the scanner object.
			if (scanner != null) {
				scanner.close();
				System.out.println("Scanner Closed");
			}
		}
	}

}
