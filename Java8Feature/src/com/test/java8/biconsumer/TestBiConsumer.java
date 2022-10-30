/**
 * 
 */
package com.test.java8.biconsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

/**
 * @author SALONI
 *
 */
class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}
}

public class TestBiConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> a = new ArrayList<Employee>();
		populate(a);
		BiConsumer<Employee, Double> c = (e,d)->e.salary=e.salary+d; 
		for(Employee e1 : a)
		{
			c.accept(e1, 500.00);
		}
		for(Employee e1 : a)
		{
		System.out.println("Employee name :"+e1.name);
		System.out.println("Employee salary :"+e1.salary);
		System.out.println();

		}
	}

	public static void populate(ArrayList<Employee> l) {

		l.add(new Employee("Saloni", 6353.09));
		l.add(new Employee("tuktuk", 236353.09));
		l.add(new Employee("Bebo", 886353.09));
	}

}
