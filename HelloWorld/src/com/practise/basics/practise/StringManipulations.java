package com.practise.basics.practise;
import java.util.Arrays;
import java.util.Scanner;

public class StringManipulations {
	
	public static boolean isAnagram(String s1, String s2)
	{
		char []c1 = s1.toCharArray();
		char []c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static String reverse(String s)
	{
		char []c1= s.toCharArray();
		int n = c1.length;
		char []c2= new char[n];
		int i,j=n-1;
		for(i=0;i<n;i++)
		{
			c2[i] = c1[j]; 
			j--;
		}
		String rev = new String(c2);
		return rev;
	}
	
	public static boolean palindrome(String s1)
	{
		String s2 = reverse(s1);
		if(s1.equals(s2))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.length() != s2.length())
		{
			System.out.println("NO");
		}
		else
		{
			if(isAnagram(s1,s2))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		String s = sc.nextLine();
		System.out.println("Reverse of "+s+" is "+ reverse(s));
		System.out.println("Palindrome? "+palindrome(s));
		sc.close();
	}

}
