/**
 * 
 */
package com.test.java8.streams;

import java.util.ArrayList;

/**
 * @author SALONI
 *
 *         min()-> max() ->
 * 
 *         Ascending order => {3,4,5,6,10,15) . Here , min=3 and max=15
 *         Descending order => (15,10,6,5,4,3) . Here , min=15 and max=3
 */
public class MinanadMaxExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(10);
		l.add(5);
		l.add(15);

		System.out.println("List is :" + l);

		// min element

		// Here compareTo() method do natural sorting it means and ascending order so
		// max is 15 and mi n is 1
		Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("the min value is :" + min);
		Integer max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("the max value is :" + max);

		// By using customized sorting -> descending order so the min = 15 and max = 1

		Integer min1 = l.stream().min((i1, i2) -> i2 - i1).get();
		System.out.println("the min1 value is :" + min1);
		Integer max2 = l.stream().max((i1, i2) -> i2 - i1).get();
		System.out.println("the max2 value is :" + max2);
	}

}
