package com.test.java8.dateandtimeapi;

import java.time.Year;
import java.util.Scanner;

// i will pass some year , write a progarm to check the year is leap or not
public class YearExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year :");

		int n = sc.nextInt();

		Year y = Year.of(n);

		if (y.isLeap()) {
			System.out.println("Given year is leap year :" + n);
		} else {
			System.out.println("Given year is not an leap year :" + n);
		}

	}

}
