package com.practise.hackerrank.exercise;
import java.util.Scanner;
import java.util.Arrays;
class Revprime {

	public static void main(String[] args) {

		int k=0;
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int []arr = new int [num];
		for(int i=0;i<num;i++)
		{
			arr[i] = ip.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<num;i++)
		{
		if(isPrime(arr[i]) && isRevPrime(arr[i]))
		{
			arr[k] = arr[i];
			k++;
		}
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(arr[i]);
		}
		ip.close();
	}
	public static boolean isPrime(int num)
	{
		int i;
		if(num==0 || num==1)
		{
			return false;
		}
		for(i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isRevPrime(int num)
	{
		int digit,reverse=0;
		while(num>0)
		{
			digit=num%10;
			num=num/10;
			reverse=reverse*10+digit;
		}
		if(isPrime(reverse))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
