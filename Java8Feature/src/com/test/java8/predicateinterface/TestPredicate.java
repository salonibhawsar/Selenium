package com.test.java8.predicateinterface;

import java.util.function.Predicate;

/*
     # Predicate is an pre defined functional interface
     # Return type of Predicate is boolean
     # Predicate Joining are also available like :
     1) p1.and(p2)
     2) p1.or.(p2)
     3) p1.negate() --> opposite of p1
     
*/
//Predicate to check whether the length of string is >(less than) 5 or not 

public class TestPredicate {

	public static void main(String[] args) {
		String[] s = { "Saloni", "Baibee", "Tuktuk", "Buggu" };
		Predicate<String> p = s1 -> s1.length() > 5; //it return true so if condition is run
		// System.out.println(p.test(s));

		for (String s2 : s) {
			if (p.test(s2)) {
				System.out.println(s2);
			}
		}
	}
}
