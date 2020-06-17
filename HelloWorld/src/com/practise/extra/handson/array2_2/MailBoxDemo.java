package com.practise.extra.handson.array2_2;

public class MailBoxDemo {
	
	public static MailBox[] sortMailBoxById(MailBox []m)
	{
		int i,j;
		MailBox temp;
		for(i=0;i<m.length;i++)
		{
			for(j=i+1;j<m.length;j++)
			{
				if(m[i].getid() > m[j].getid())
				{
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		return m;
	}

	public static void main(String[] args) {
		MailBox []m = new MailBox[5];
		m[0]= new MailBox(73,"kdqktps","glwiegn");
		m[1]= new MailBox(77,"qjftnil","fbigazj");
		m[2]= new MailBox(95,"ukeadms","egndouz");
		m[3]= new MailBox(87,"njhzbtc","orcmqza");
		m[4]= new MailBox(29,"dyifepd","avfznpr");	
		
		MailBox []s = sortMailBoxById(m);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getid()+" "+s[i].getname()+" "+s[i].getcreationDate());
		}
				
	}

}
