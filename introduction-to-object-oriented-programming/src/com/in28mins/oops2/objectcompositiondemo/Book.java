package com.in28mins.oops2.objectcompositiondemo;

import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private String author;
	private ArrayList<Reviews> reviews = new ArrayList<Reviews>();

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReviews(Reviews review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("Id - [%d], Name - [%s], Author - [%s], reviews - [[[%s]]]", id, name, author,
				reviews.toString());
	}
}
