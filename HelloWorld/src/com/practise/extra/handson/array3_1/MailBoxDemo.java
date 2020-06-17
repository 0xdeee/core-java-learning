package com.practise.extra.handson.array3_1;

public class MailBoxDemo {
	
	public static MailBox[] searchMailBoxByName(MailBox []m, String str)
	{
		int i,j=0,count=0;
		for(i=0;i<m.length;i++)
		{
			if(m[i].getName().equals(str))
			{
				count ++;
			}
		}
		MailBox []mail = new MailBox[count];
		if(count<=0)
		{
			mail = null;
		}
		for(i=0;i<m.length;i++)
		{
			if(m[i].getName().equals(str))
			{
				mail[j] = m[i];
				j++;
			}
		}
		return mail;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailBox []m = new MailBox[5];
		m[0]= new MailBox(30,"lsatkwk","ckbkape");
		m[1]= new MailBox(38,"jbqeszs","tzxuuhz");
		m[2]= new MailBox(22,"rpatwey","qkkjexb");
		m[3]= new MailBox(80,"pfciraa","unafxwg");
		m[4]= new MailBox(39,"ghohpje","fglxdpa");
		
		MailBox []result1 = searchMailBoxByName(m,"hxrkvyu");
		if(result1 == null)
		{
			System.out.println("Output After Search is Null");
		}
		else
		{
			System.out.println("Displaying contents of result array");
			for(MailBox mail:result1)
			{
				System.out.println(mail.getId()+" "+mail.getName()+" "+mail.getCreationDate());
			}
		}
		
		MailBox []result2 = searchMailBoxByName(m,"lsatkwk");
		if(result2 == null)
		{
			System.out.println("Output After Search is Null");
		}
		else
		{
			System.out.println("Displaying contents of result array");
			for(MailBox mail:result2)
			{
				System.out.println(mail.getId()+" "+mail.getName()+" "+mail.getCreationDate());
			}
		}
	}

}
