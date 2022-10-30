/**
 * 
 */
package com.test.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SALONI
 *
 */
public class CustomizedSortingUsinSstream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(18);
		marks.add(50);
		marks.add(76);
		marks.add(44);
		marks.add(94);
		marks.add(66);

		System.out.println("Previous marks :" + marks);

		/*
		 * List<Integer> l = marks.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2)
		 * ? -1 : 0) .collect(Collectors.toList());
		 */

		List<Integer> l = marks.stream().sorted((i1, i2) -> i1 - i2).collect(Collectors.toList());

		System.out.println("customized list in ascending oredr :" + l);

		/*
		 * List<Integer> l1 = marks.stream().sorted((i1, i2) -> (i1 < i2) ? -1 : (i1 >
		 * i2) ? 1 : 0) .collect(Collectors.toList());
		 */

		List<Integer> l1 = marks.stream().sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());
		System.out.println("customized list in descending oredr :" + l1);

	}

}
