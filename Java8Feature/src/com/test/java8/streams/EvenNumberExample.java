package com.test.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Stream for print only even numbers from the arraylist
public class EvenNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(27);
		l.add(46);
		l.add(90);
		l.add(23);
		l.add(87);
		l.add(40);
		l.add(66);

		System.out.println("List is :" + l);

		// stream concept using filter() -> used for conditional statement

		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("List of even numebers :" + l2);

		// another example to add 5 grace marks
		// stream using map() --> used for performing any operation

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(18);
		marks.add(50);
		marks.add(76);
		marks.add(44);

		System.out.println("Previous marks :" + marks);
		List<Integer> updatedmarks = marks.stream().map(j -> j + 5).collect(Collectors.toList());

		System.out.println("Updated marks are :" + updatedmarks);

		// another example --> please count how many falied students are there

		int nooffailedstudent = (int) marks.stream().filter(i -> i < 33).count();
		System.out.println();
		System.out.println("No of failed students are :" + nooffailedstudent);

		// another example sorted()
		

		List<Integer> sortstudents = marks.stream().sorted().collect(Collectors.toList());
		System.out.println();
		System.out.println("Sorted students are :" + sortstudents);

	}

}
