package com.in28mins.oops2.objectcompositiondemo;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Think and Grow Rich", "Napolean hill");
		book.addReviews(new Reviews(123, "Awesome book", 5));
		book.addReviews(new Reviews(456, "Best book", 5));
		System.out.println(book.toString());

	}

}
