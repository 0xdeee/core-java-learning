package com.practise.array.basics;
import java.util.Scanner;
public class PrimitiveSearch {
	
	static int searchElement (int []list,int element)
	{
		int i=0;
		for(i=0;i<list.length;i++)
		{
			if(list[i]==element)
				return i;
		}
		return -1;
	}
	
	public static void  replaceElement(int []list,int index,int newvalue)
	{
		int i;
		for(i=0;i<list.length;i++)
		{
			if(i==index)
			{
				list[i]=newvalue;
				break;
			}
		}
		System.out.println();
		for(i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
	}

	public static void main(String[] args) {
		int[] list = new int[] {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int s,n;
		System.out.println("enter the element to be searched: ");
		s= sc.nextInt();
		int index = searchElement (list,s);
		if(index>0)
		{
			System.out.println("Enter the replacement: ");
			n = sc.nextInt();
			replaceElement(list,index,n);
		}
		else
			System.out.println("Element not Found");
		sc.close();
	}

}
