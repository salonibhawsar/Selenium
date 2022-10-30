package com.test.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

	String name;
	int eno;

	Employee(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return name + ":" + eno;
	}

}

public class SortEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Employee e = new Employee("Saloni", 1); System.out.println(e);
		 */
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("Saloni", 4546));
		e.add(new Employee("Tuktuk", 267));
		e.add(new Employee("Ganga", 4223));
		e.add(new Employee("Buggu", 42124));
		e.add(new Employee("Baibee", 5));
		e.add(new Employee("Bau", 62573));
		System.out.println(e);
		// sort list of employees on the basis of their employee number
		// Collections.sort(e,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		Collections.sort(e, (e1, e2) -> e1.eno - e2.eno);
		System.out.println(e);
		// sort list of employees on the basis of their employee name
		Collections.sort(e, (e1, e2) -> e1.name.compareTo(e2.name));
		System.out.println(e);

	}

}
