package com.practise.extra.handson.array2_4;

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
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setcreationDate(String creationDate)
	{
		this.creationDate=creationDate;
	}
	public String getcreationDate()
	{
		return creationDate;
	}

}


