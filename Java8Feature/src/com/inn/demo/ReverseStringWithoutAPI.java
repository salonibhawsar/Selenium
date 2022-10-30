/**
 * 
 */
package com.inn.demo;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SALONI write a code to revrese a string without any API
 * 
 */
public class ReverseStringWithoutAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using loop

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the string");
		 * s = sc.nextLine(); char str[] = s.toCharArray(); n = str.length;
		 * System.out.println("Reversed string is"); for (i = n - 1; i >= 0; i--) {
		 * System.out.print(str[i]); }
		 */

		// using stream api

		String input = "Hello";
		String result = Stream.of(input.split("")).sorted((s1, s2) -> -1).collect(Collectors.joining());
		System.out.println("the reverse string is :" + result);

		// another solution

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("insert the string that you want to reverse :");
		String str = sc.nextLine();

		// Solution 1.
		int l = str.length();
		String reverse = "";
		for (int i = l - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		System.out.println(reverse);
	}

}
