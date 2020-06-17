package com.in28mins.oops2.objectcompositiondemo;

public class Reviews {
	private int id;
	private String description;
	private int rating;

	public Reviews(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("review_id - [%d], review_desc - [%s], rating - [%d]", this.id, this.description,
				this.rating);
	}

}
