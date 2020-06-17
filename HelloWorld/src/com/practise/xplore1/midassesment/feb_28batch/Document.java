package com.practise.xplore1.midassesment.feb_28batch;
import java.util.Scanner;
public class Document {
	
	int id;
	String title;
	String filename;
	int pages;
	
	Document(){}
	
	Document(int id, String title, String filename, int pages)
	{
		this.id=id;
		this.title=title;
		this.filename=filename;
		this.pages=pages;
	}
	
	public static Document combineDocuments(Document []d)
	{
		Document result = new Document();
		result.id= d.length+1;
		result.title= d[0].title+"#"+d[1].title+"#"+d[2].title+"#"+d[3].title;
		result.filename= d[0].filename+"@"+d[1].filename+"@"+d[2].filename+"@"+d[3].filename;
		int sum = 0;
		for(int i=0;i<d.length;i++)
		{
			sum = sum + d[i].pages;
		}
		result.pages = sum;
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Document []d = new Document[4];
		for(int i=0;i<d.length;i++)
		{
			int id = sc.nextInt();sc.nextLine();
			String title = sc.nextLine();
			String filename = sc.nextLine();
			int pages = sc.nextInt();sc.nextLine();
			d[i] = new Document(id,title,filename,pages);
		}
		
		Document result = combineDocuments(d);
		
		System.out.println();
		System.out.println();
		System.out.println(result.id+""+result.title+""+result.filename+""+result.pages);
		sc.close();
		
	}

}
