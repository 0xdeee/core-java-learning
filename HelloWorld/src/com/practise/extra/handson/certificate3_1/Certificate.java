package com.practise.extra.handson.certificate3_1;

public class Certificate {
	private int id;
	private String title;
	private String date;
	private int rank;
	
	Certificate(int id, String title, String date, int rank)
	{
		this.id=id;
		this.title=title;
		this.date=date;
		this.rank=rank;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date=date;
	}
	public int getRank()
	{
		return rank;
	}
	public void setRank(int rank)
	{
		this.rank=rank;
	}

}
