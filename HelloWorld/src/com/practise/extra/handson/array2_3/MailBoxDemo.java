package com.practise.extra.handson.array2_3;

public class MailBoxDemo {
	
	public static MailBox[] sortMailBoxByName(MailBox []m)
	{
		int i,j;
		MailBox temp;
		for(i=0;i<m.length;i++)
		{
			for(j=i+1;j<m.length;j++)
			{
				if(m[i].getname().compareTo(m[j].getname())>0)
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
		MailBox mailbox1= new MailBox(67,"isyvzun","egyyxwz");
		MailBox mailbox2= new MailBox(74,"xrxpxrr","bkmxnck");
		MailBox mailbox3= new MailBox(12,"xcromhc","sbndhax");
		MailBox mailbox4= new MailBox(22,"jlnyloj","ouyrjyo");
		MailBox mailbox5= new MailBox(9,"xyyhkuk","usqzuhu");


		MailBox[] objArray= {mailbox1,mailbox2,mailbox3,mailbox4,mailbox5};

		MailBox[] objArrayRes= sortMailBoxByName(objArray);
		System.out.println("Displaying contents of array: ");

		for(MailBox mailbox:objArrayRes)
		{
		System.out.println(mailbox.getid()+" " + mailbox.getname()+" " + mailbox.getcreationDate()+" ");
		}
	}

}
