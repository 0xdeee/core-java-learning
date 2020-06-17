package com.practise.extra.handson.array2_1;

public class MailBoxDemo {
	
	public static boolean replaceMailBoxById(MailBox []m, MailBox f)
	{
		int i;
		for(i=0;i<m.length;i++)
		{
			if(m[i].getid() == f.getid())
			{
				String newname = f.getname();
				m[i].setname(newname);
				m[i].setcreationDate(f.getcreationDate());
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		MailBox []m = new MailBox[5];
		m[0]=new MailBox(22,"rsqhpiz","yjsympz");
		m[1]=new MailBox(83,"xwjrqnu","ahrxtbb");
		m[2]=new MailBox(47,"zgesjsr","cxnkctl");
		m[3]=new MailBox(66,"xaosles","jvdrtxf");
		m[4]=new MailBox(1,"yilxuua","ycnejof");
		
		MailBox f = new MailBox(27,"ffatwgo","dkxgaid");
		
		boolean result = replaceMailBoxById(m, f);
		System.out.println("Output on performing replacement: "+result);
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].getid()+" "+m[i].getname()+" "+m[i].getcreationDate());
		}
		System.out.println();
		
		MailBox g = new MailBox(1,"hqzmrfz","fcbudyi");
		
		result = replaceMailBoxById(m, g);
		System.out.println("Output on performing replacement: "+result);
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].getid()+" "+m[i].getname()+" "+m[i].getcreationDate());
		}
		
	}

}
