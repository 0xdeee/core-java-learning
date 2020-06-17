package com.in28mins.exceptionhandling;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		
		try {
			int[] numbers = { 1, 2, 3, 4, 5 };
			int number = numbers[21];
			System.out.println(number);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// If we have multiple exceptions to handle it must be defined in child class to
		// parent class not the other way around, it will throw compilation error.

//		catch(Exception e) {
//			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}

		// we can also catch multiple exceptions at the same catch like this

//		catch(IOException | SQLException e) {
//			e.printStackTrace();
//		}

	}

}
