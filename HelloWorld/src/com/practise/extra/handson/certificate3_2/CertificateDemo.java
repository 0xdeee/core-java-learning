package com.practise.extra.handson.certificate3_2;

public class CertificateDemo {
	
	public static Certificate[] searchCertificateByRank(Certificate []c,int rank1)
	{
		int i,j=0,count=0;
		for(i=0;i<c.length;i++)
		{
			if(c[i].getRank() == rank1)
			{
				count++;
			}
		}
		Certificate []cn = new Certificate[count];
		for(i=0;i<c.length;i++)
		{
			if(c[i].getRank() == rank1)
			{
				cn[j] = c[i];
				j++;
			}
		}
		if(count <= 0 )
		{
			cn = null;
		}
		return cn;
	}

	public static void main(String[] args) {
		
		Certificate []c = new Certificate[5];
		c[0]= new Certificate(98,"pflgqlv","eozatxv",21);
		c[1]= new Certificate(84,"ktewxch","agliblo",62);
		c[2]= new Certificate(94,"urlzbdv","vtnujet",40);
		c[3]= new Certificate(37,"icszoul","gpygijp",93);
		c[4]= new Certificate(51,"gfvevba","dvhjdfe",16);

		
		Certificate []result1 = searchCertificateByRank(c,12);
		if(result1 == null)
		{
			System.out.println("Output for first operation is NULL");
		}
		else
		{
			System.out.println("Displaying contents of result array:");
			
			for(Certificate certi:result1)
			{
				System.out.println(certi.getId()+" "+certi.getTitle()+" "+certi.getDate()+" "+certi.getRank());
			}
		}
		
		Certificate []result2 = searchCertificateByRank(c,40);
		if(result2 == null)
		{
			System.out.println("Output for first operation is NULL");
		}
		else
		{
			System.out.println("Displaying contents of result array:");
			
			for(Certificate certi:result2)
			{
				System.out.println(certi.getId()+" "+certi.getTitle()+" "+certi.getDate()+" "+certi.getRank());
			}
		}

	}

}
