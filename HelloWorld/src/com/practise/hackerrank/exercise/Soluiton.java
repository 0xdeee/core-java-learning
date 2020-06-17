package com.practise.hackerrank.exercise;

import java.util.Scanner;

public class Soluiton {
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n,i;
		n = sc.nextInt();
		Student []s = new Student[n];
		for(i=0;i<s.length;i++)
		{
			int id = sc.nextInt();
			String name = sc.next();
			String city = sc.next();
			double marks = sc.nextDouble();
			s[i] = new Student(id,name,city,marks);
		}
		String cit = sc.next();
		double mar = sc.nextDouble();
		Student []stud = getStudentsWithCityAndMarks(s, cit, mar);
		System.out.println(stud.length);
		for(i=0;i<stud.length;i++)
		{
			System.out.println(stud[i].id+" "+stud[i].name+" "+stud[i].city+" "+stud[i].marks);
		}
		sc.close();
	}
	
	public static Student[] getStudentsWithCityAndMarks(Student []s, String city, double marks)
	{
		int i,j=0,count=0;
		for(i=0;i<s.length;i++)
		{
			if(s[i].city.equals(city))
			{
				if(s[i].marks==marks)
				{
					count++;
				}
			}
		}
		Student []stud = new Student[count];
		for(i=0;i<s.length;i++)
		{
			if(s[i].city.equals(city))
			{
				if(s[i].marks==marks)
				{
					stud[j] = s[i];
					j++;
				}
			}
		}
		
		return stud;
	}

}


