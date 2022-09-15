package com.ust_set5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat_Example {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		String date="14/10/2020";
		LocalDate localDate=LocalDate.parse(date, formatter);
		System.out.println("parsed local date: "+localDate);
		System.out.println("Formatted local date: "+formatter.format(localDate));
	}
}
