/**
 * 
 */
package com.test.java8.bipredicate;

import java.util.function.BiPredicate;

/**
 * @author SALONI
 *
 */
public class TestBiPredicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p.test(10, 20));
	}

}
