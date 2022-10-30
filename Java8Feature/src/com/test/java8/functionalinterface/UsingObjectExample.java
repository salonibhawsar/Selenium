package com.test.java8.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

//Grade of the student based on the marks
class Student {
	int marks;
	String name;

	Student(int marks, String name) {
		this.marks = marks;
		this.name = name;

	}

	public int marks() {
		// TODO Auto-generated method stub
		return marks;
	}
}

public class UsingObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student, String> f = s -> {
			int marks = s.marks();
			String grade = "";
			if (marks >= 80)
				grade = "A";
			else if (marks >= 60)
				grade = "B";
			else if (marks >= 50)
				grade = "C";
			else if (marks >= 35)
				grade = "D";
			else				grade = "E";
			return grade;
		};
		Predicate<Student> p = s1 -> s1.marks > 60; // here use of predicate also 
		Student[] s = { new Student(65, "Saloni"), new Student(45, "Tuktuk"), new Student(98, "Bebo") };

		for (Student s2 : s) {
			if (p.test(s2)) {
				System.out.println("Student name :" + s2.name);
				System.out.println("Student marks :" + s2.marks);
				System.out.println("Student grade :" + f.apply(s2));
				System.out.println();
			}

		}
	}

}
