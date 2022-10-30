
/**
 * 
 */
package com.test.java8.functionalinterface;

import java.util.function.Function;

/**
 * @author SALONI
 * 
 *         Function :: input --> perform some operations --> output
 * 
 *         ___________________FUNCTION Chaining_________________________________
 * 
 *         1) f1.andThen(f2).apply(i) ; //1st f1 followed by f2 2)
 *         f1.compose(f2).apply(i) ; // 1st f2 then f1
 * 
 */
public class TestFunctional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(6));

		// function chaining

		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = i -> i * i * i;
		System.out.println("Function Chaining");
		System.out.println();
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}

}
