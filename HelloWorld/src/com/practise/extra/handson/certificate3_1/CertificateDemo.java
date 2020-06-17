package com.practise.extra.handson.certificate3_1;

public class CertificateDemo {
	
	public static Certificate[] getEvenPositionCertificate(Certificate []c)
	{
		int i,j=0,count=0;
		for(i=0;i<c.length;i++)
		{
			if(i==0 || i%2==0)
			{
				count++;
			}
		}
		Certificate []cn = new Certificate[count];
		for(i=0;i<c.length;i++)
		{
			if(i==0 || i%2==0)
			{
				cn[j] = c[i];
				j++;
			}
		}
		return cn;
	}

	public static void main(String[] args) {
		
		Certificate []c = new Certificate[5];
		c[0]= new Certificate(60,"cnexirk","cbnifms",77);
		c[1]= new Certificate(45,"gphspvq","pqjbhmz",62);
		c[2]= new Certificate(41,"nfpxsmp","vimiopu",89);
		c[3]= new Certificate(95,"ionouca","bsbknpx",38);
		c[4]= new Certificate(39,"yhzrafu","itnbskb",44);
		
		Certificate []result1 = getEvenPositionCertificate(c);
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

	}

}
