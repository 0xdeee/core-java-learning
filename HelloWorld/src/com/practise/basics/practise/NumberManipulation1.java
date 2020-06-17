package com.practise.basics.practise;
import java.util.Scanner;

public class NumberManipulation1 {
	
	public static boolean isPerfect(int n)
	{
		int i,sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum == n)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isArmstrong(int n)
	{
		int pow=0,dup,sum=0,digit;
		dup = n;
		while(dup>0)
		{
			dup=dup/10;
			pow++;
		}
		dup = n;
		while(dup>0)
		{
			digit = dup%10;
			dup = dup/10;
			sum = sum +(int) Math.pow(digit, pow);
		}
		if(sum == n)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Is the number Perfect? "+isPerfect(n));
		System.out.println();
		System.out.println("Is the number Armstrong? "+isArmstrong(n));
		sc.close();
	}

}
