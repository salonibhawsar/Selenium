package com.test.java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateAndTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();

		System.out.println("Currents date is :" + date);

		int dd = date.getDayOfMonth();
		System.out.println("Currents date day is :" + dd);

		int mm = date.getMonthValue();
		System.out.println("Currents date month is :" + mm);

		int yy = date.getYear();
		System.out.println("Currents date year is :" + yy);

		LocalTime time = LocalTime.now();

		System.out.println("Current time is :" + time);

		int hh = time.getHour();
		int m = time.getMinute();
		int ss = time.getSecond();

		System.out.printf("%d - %d - %d", hh, m, ss);

		LocalDateTime datetime = LocalDateTime.now();

		System.out.println("Current Date and time is :" + datetime);

	}

}
