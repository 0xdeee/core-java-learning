package com.practise.classes.basics;
import java.util.*;

public class CheckEmail {
	int id;
	String name;
	String email;
	
	CheckEmail(int id, String name, String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public static boolean checkEmail(CheckEmail []e, String dom)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].email.contains(dom))
			{
				
			}
			else
			{
				return false;
			}
		}
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		CheckEmail []e = new CheckEmail[n];
		for(int i=0;i<n;i++)
		{
			int id = ip.nextInt();ip.nextLine();
			String name = ip.nextLine();
			String email = ip.nextLine();
			e[i] = new CheckEmail(id,name,email);
		}
		String maildomain = ip.nextLine();
		if(checkEmail(e,maildomain))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		ip.close();
	}

}
