package com.practise.extra.handson.array3_1;

public class MailBox {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	private String name;
	private String creationDate;
	
	MailBox(int id, String name, String creationDate)
	{
		this.id=id;
		this.name=name;
		this.creationDate=creationDate;
	}
	
	
}
