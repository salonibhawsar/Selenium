/**
 * 
 */
package com.test.java8.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author SALONI
 *
 */
public class TestBiFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> f = (a,b)->a*b;
		System.out.println(f.apply(5, 4));
	}

}
