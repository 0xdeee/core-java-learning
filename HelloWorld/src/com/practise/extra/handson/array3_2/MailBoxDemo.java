package com.practise.extra.handson.array3_2;

public class MailBoxDemo {
	
	public static MailBox[] searchMailBoxByCreationDate(MailBox []m, String str)
	{
		int i,j=0,count=0;
		for(i=0;i<m.length;i++)
		{
			if(m[i].getCreationDate().equals(str))
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
			if(m[i].getCreationDate().equals(str))
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
		m[0]= new MailBox(93,"hfyquem","xclzutr");
		m[1]= new MailBox(25,"ajdlukm","rahcqck");
		m[2]= new MailBox(26,"rsusdgf","upxpgwq");
		m[3]= new MailBox(37,"kasysrr","rahcqck");
		m[4]= new MailBox(39,"fvhepzs","djkljsd");
		
		MailBox []result1 = searchMailBoxByCreationDate(m,"jvxfaua");
		if(result1 == null)
		{
			System.out.println("Output After first Search is Null");
		}
		else
		{
			System.out.println("Displaying contents of result array:");
			for(MailBox mail:result1)
			{
				System.out.println(mail.getId()+" "+mail.getName()+" "+mail.getCreationDate());
			}
		}
		
		MailBox []result2 = searchMailBoxByCreationDate(m,"rahcqck");
		if(result2 == null)
		{
			System.out.println("Output After second Search is Null");
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
