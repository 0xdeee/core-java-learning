package com.practise.extra.handson.array3_3;

public class MailBox {
	private int id;
	private String name;
	private String creationDate;
	
	MailBox(int id, String name, String creationDate)
	{
		this.id=id;
		this.name=name;
		this.creationDate=creationDate;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCreationDate(String creationDate)
	{
		this.creationDate=creationDate;
	}
	public String getCreationDate()
	{
		return creationDate;
	}
}
