/**
 * 
 */
package com.test.java8.streams;

import java.util.ArrayList;

/**
 * @author SALONI
 * 
 * 
 *         forEach() ---> l.stream.forEach(Function); or
 *         l.stream.forEach(System.out::println) ;
 * 
 * 
 *         toArray() ---> To convert the stream of objects into Array.
 *
 */
public class ToArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(10);
		l.add(5);
		l.add(15);

		System.out.println(l);

		Integer[] i = l.stream().toArray(Integer[]::new);

		System.out.println(i);

		for (Integer i1 : i) {
			System.out.println(i1);
		}

	}

}
