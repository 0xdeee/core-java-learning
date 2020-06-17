package com.practise.conditional.basics;

public class MaxAge {
	int id;
	String name;
	int age;
	
	MaxAge(int id,String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public static void eldest(MaxAge a, MaxAge b, MaxAge c)
	{
		if(a.age>b.age && a.age>c.age)
		{
			System.out.println("A is eldest");		
		}
		else if(b.age>c.age)
		{
			System.out.println("B is eldest");
		}
		else
		{
			System.out.println("C is eldest");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxAge a = new MaxAge(1,"dilip",18);
		MaxAge b = new MaxAge(2,"stark",21);
		MaxAge c = new MaxAge(3,"stk",17);
		eldest(a,b,c);
 	}

}
