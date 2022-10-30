/**
 * 
 */
package com.test.java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author SALONI
 *
 * 
 *         PERTIOD
 */

//i want to know the age
public class PeriodExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate birthdate = LocalDate.of(1998, 6, 4);

		LocalDate today = LocalDate.now();

		Period p = Period.between(birthdate, today);

		System.out.printf("Age is %d Years %d Months %d Days:", p.getYears(), p.getMonths(), p.getDays());

		LocalDate deathDate = LocalDate.of(1998, 8, 6);

		Period deathday = Period.between(deathDate, today);

		int d = deathday.getYears() * 365 + deathday.getMonths() * 30 + deathday.getDays();

		System.out.println();
		System.out.println("Your death came in :" + d);
	}

}
