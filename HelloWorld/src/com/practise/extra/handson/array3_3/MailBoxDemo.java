package com.practise.extra.handson.array3_3;


public class MailBoxDemo {
	
	public static MailBox[] getOddPositionMailBox(MailBox []m)
	{
		int i,j=0,count=0;
		for(i=0;i<m.length;i++)
		{
			if(i!=0 && i%2!=0)
			{
				count++;
			}
		}
		MailBox []r = new MailBox[count];
		for(i=0;i<m.length;i++)
		{
			if(i!=0 && i%2!=0)
			{
				r[j] = m[i];
				j++;
			}
		}
		if(count <=0)
		{
			r = null;
		}
		return r;
	}
public static void main(String args[]){
MailBox mailbox1= new MailBox(18,"scfkfwm","vjlhejv");
MailBox mailbox2= new MailBox(44,"vykwuqm","hxbgccj");
MailBox mailbox3= new MailBox(77,"ddwhwhg","eiqshsv");
MailBox mailbox4= new MailBox(79,"ctppqch","quyvfim");
MailBox mailbox5= new MailBox(9,"fdoyxqc","vikysdr");


MailBox[] objArray= {mailbox1,mailbox2,mailbox3,mailbox4,mailbox5};

MailBox[] objResultArray1= getOddPositionMailBox(objArray);
if(objResultArray1==null){
System.out.println("Output after first operation is null. ");
}else{
System.out.println("Displaying contents of result array: ");

for(MailBox mailbox:objResultArray1){
System.out.println(mailbox.getId()+" " + mailbox.getName()+" " + mailbox.getCreationDate()+" ");
}
}
}
}