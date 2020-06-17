package com.practise.basics.practise;
import java.util.Scanner;

public class Fibonacci {
	
	public static int[] fiboSeries(int n)
	{
		int i,f=0,s=1;
		int []sum = new int[n+1]; 
		for(i=1;i<=n;i++)
		{
			if(i==1)
			{
				sum[i]=f;
			}
			else if(i==2)
			{
				sum[i]=s;
			}
			else
			{
				sum[i]=f+s;
				f=s;
				s=sum[i];
			}
		}
		return sum;
	}
	
	public static int nthFibo(int n)
	{
		int []fib = fiboSeries(n);
		return fib[n];
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []fiboseries = fiboSeries(n);
		System.out.println("Fibonacci sereis for "+n+" term:");
		for(int i=1;i<fiboseries.length;i++)
		{
			System.out.print(fiboseries[i]+" ");
		}
		int fiboterm = nthFibo(n);
		System.out.println();
		System.out.println();
		System.out.println(n+"th Fibonacci term is "+fiboterm);
		sc.close();
	}

}
