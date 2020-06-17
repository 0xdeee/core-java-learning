package com.practise.classes.basics;

public class NameSwap {
	int id;
	String name;
	
	NameSwap(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void swapping(NameSwap a, NameSwap b)
	{
		String temp;
		temp=a.name;
		a.name=b.name;
		b.name=temp;
	}
	public static void printing(NameSwap a, NameSwap b)
	{
		System.out.println(a.id+" "+a.name);
		System.out.println(b.id+" "+b.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameSwap a = new NameSwap(1,"Dilip");
		NameSwap b = new NameSwap(2,"Stark");
		swapping(a,b);
		printing(a,b);

	}

}
