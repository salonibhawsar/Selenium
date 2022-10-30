/**
 * 
 */
package com.test.java8.dateandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author SALONI
 *
 */
public class ZoneIdExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZoneId zone = ZoneId.systemDefault();

		System.out.println("Current System Default zone is :" + zone);

		// How to reprst a particular zone

		ZoneId l = ZoneId.of("America/Los_Angeles");

		ZonedDateTime dt = ZonedDateTime.now(l);

		System.out.println(dt);

	}

}
