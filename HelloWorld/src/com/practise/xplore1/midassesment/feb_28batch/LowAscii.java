package com.practise.xplore1.midassesment.feb_28batch;
import java.util.Scanner;
import java.util.Arrays;

public class LowAscii {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Ascii values of each character in the string are as follows: ");
		System.out.println();
		char []carray = str.toCharArray();
		Arrays.sort(carray);
		System.out.println(carray[carray.length -1]);
		
		
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			System.out.println(c+" = "+(int)c);
		}
		/*char min = 'z';
		System.out.println();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) < min)
			{
				min = str.charAt(i);
			}
		}
		System.out.println("The character with lowest ASCII value "+min+" with a value of "+(int)min);
		*/sc.close();
	}

}
