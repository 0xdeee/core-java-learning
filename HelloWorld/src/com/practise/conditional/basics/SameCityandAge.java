package com.practise.conditional.basics;

public class SameCityandAge {
	int id;
	String name;
	String city;
	int age;
	
	SameCityandAge(int id, String name, String city, int age)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.age=age;
	}
	
	public static int findSameCityandAge(SameCityandAge a, SameCityandAge b, SameCityandAge c)
	{
		if((a.city.equals(b.city) && a.city.equals(c.city)) && (a.age == b.age && a.age == c.age))
		{
			return 3;
		}
		else if((a.city.equals(b.city)) && a.age == b.age)
		{
			return 2;
		}
		else if((a.city.equals(c.city)) && a.age == c.age)
		{
			return 2;
		}
		else 
		{
			if((b.city.equals(c.city)) && b.age == c.age)
			return 2;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameCityandAge a = new SameCityandAge(1,"stark","mdu",21);
		SameCityandAge b = new SameCityandAge(2,"stk","chennai",22);
		SameCityandAge c = new SameCityandAge(3,"dstark","mdu",21);
		System.out.println(findSameCityandAge(a,b,c));
	}

}
