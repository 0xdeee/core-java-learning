package com.in28mins.dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaDates {

	public static void main(String[] args) {
		// java date api was introduced in JAVA 8 deriving key features from JODA an
		// java plugin to use date operations
		// cuz the date function in java prior to JAVA 8 was soo BAD

		// Java Date Api provides many classes, 3 important one are ->

		// LocalDate
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getEra());
		System.out.println(date.getYear());
		System.out.println(date.isLeapYear());
		System.out.println(date.lengthOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getChronology());

		// plus* methods
		System.out.println(date.plusDays(100));// returns date after 100 days
		System.out.println(date.plusMonths(3));// returns date after 3 months
		System.out.println(date.plusWeeks(12));// returns date after 12 weeks
		System.out.println(date.plusYears(10));// returns date after 10 years

		// with* methods
		System.out.println(date.withYear(2040));// the date with specified year
		System.out.println(date.withMonth(12));// the date with specified Month
		System.out.println(date.withDayOfMonth(21));// the date with specified day
		System.out.println(date.withDayOfYear(210));// somewhat diff than other with*() methods gets 210th day of the
													// year
//		 similarly there are minusDays, minusMonths, etc.
//		 **** note that LocalDate is immutable all these functions we used won't alter
//		 the orginal value of our date object******
		System.out.println();

		// **************Comapring two localDate instances************
		LocalDate lastMonth = LocalDate.of(2020, 04, 16);// LocalDate.of() can be used to set a date of our own
		System.out.println(lastMonth);
		System.out.println(date.isAfter(lastMonth));// will be true
		System.out.println(date.isBefore(lastMonth));// will be false
		System.out.println();

		// LocalDateTime
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		// similar to methods in localDate here there will also be methods to alter
		// time as well

		// LocalTime
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
	}

}
