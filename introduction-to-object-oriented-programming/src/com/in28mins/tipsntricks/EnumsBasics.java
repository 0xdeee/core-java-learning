package com.in28mins.tipsntricks;

import java.util.Arrays;

// Enums can be used when we want a certain variable to only hold values of predefined set.
// an example of season, as these are 4 major seasons we want our season type to only have either of these given values
enum Season {
	SUMMER(1), WINTER(2), FALL(3), SPRING(4);

	private int value;

	// constructor to set values to uniquely identify resources in Enums... if their
	// postions change their ordinals will change but not their value
	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class EnumsBasics {

	public static void main(String[] args) {
		// Method_1 to access the value of Enums
		Season season = Season.SPRING;
		System.out.println(season);
		// Method_2 to access the value of Enums
		Season season1 = Season.valueOf("FALL");
		System.out.println(season1);
		// ordinals are like indexes in arrays, it marks the postion of the particular
		// enum value in the enum list, but we can use it to store elements in DB by
		// refering to an elements ordinal, because the positions can be changed and
		// this will cause some unwanted problems.
		System.out.println(Season.SPRING.ordinal());
		// to get all the values of Enum
		System.out.println(Arrays.toString(Season.values()));
		// method to store Enums in DB
		// we cant store ENUM types directly in DB and using ordinals i.e, indexes of
		// elements also wont boad well because if positions are changed this may cause
		// error
		// so to save it in DB we can give the elements an unique ID so that all have to
		// be stored is ID and if we fetch the ID from DB and get the ENUM that has that
		// ID then we have just did post and get opertion from DB

		System.out.println(Season.SPRING.getValue());

	}

}
