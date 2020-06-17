package com.practise.basics.practise;
import java.util.Scanner;

public class NumberManipulation {
	
	public static int sumOfDigits(int n)
	{
		int sum=0,digit;
		while(n>0)
		{
			digit = n%10;
			n = n/10;
			sum = sum + digit;
		}
		return sum;
	}
	
	public static int sumOfDigitsTill1(int n)
	{
		int sum=0;
		while(n>0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum =  sum + (n%10);
			n=n/10;
		}
		return sum;
		
	}
	
	public static int reverse(int n)
	{
		int rev=0,digit;
		while(n>0)
		{
			digit = n%10;
			n=n/10;
			rev=rev*10+digit;
		}
		return rev;
	}
	
	public static boolean palindrome(int n1, int n2)
	{
		if(n1==n2)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Number: "+n);
		System.out.println("Reverse of Number: "+reverse(n));
		System.out.println("Sum of Digits: "+sumOfDigits(n));
		System.out.println("Sum of Digits till 1 digit: "+sumOfDigitsTill1(n));
		System.out.println("Is it Palindrome? "+palindrome(n,reverse(n)));
		sc.close();
	}

}
