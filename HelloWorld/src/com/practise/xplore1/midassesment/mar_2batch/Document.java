package com.practise.xplore1.midassesment.mar_2batch;
import java.util.Scanner;

public class Document {
	int id;
	String title;
	String folderName;
	int pages;
	public Document(int id, String title, String folderName, int pages) 
	{
		this.id = id;
		this.title = title;
		this.folderName = folderName;
		this.pages = pages;
	}

	
	public static Document[] getDocumentWithOddPages(Document d[])
	{
		int i,j=0,count =0;
		for(i=0;i<d.length;i++)
		{
			if(d[i].pages%2 != 0)
			{
				count++;
			}
		}
		Document []r = new Document[count];
		for(i=0;i<d.length;i++)
		{
			if(d[i].pages%2 != 0)
			{
				r[j] = d[i];
				j++;
			}
		}
		Document temp;
		for(i=0;i<r.length;i++)
		{
			for(j=i+1;j<r.length;j++)
			{
				if(r[i].id>r[j].id)
				{
					temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}
		return r;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Document []d = new Document[4];
		for(int i=0;i<d.length;i++)
		{
			int id = sc.nextInt();
			String title = sc.next();
			String folderName = sc.next();
			int pages = sc.nextInt();
			
			d[i] = new Document(id,title,folderName,pages);
		}
		Document []r = getDocumentWithOddPages(d);
		for(int i=0;i<r.length;i++)
		{
			System.out.println(r[i].id+" "+r[i].title+" "+r[i].folderName+" "+r[i].pages);
		}
		sc.close();
	}

}
