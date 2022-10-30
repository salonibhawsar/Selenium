package com.test.java8.predicateinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("Saloni", 4546));
		e.add(new Employee("Tuktuk", 2267));
		e.add(new Employee("Ganga", 4223));
		e.add(new Employee("Buggu", 42124));
		e.add(new Employee("Baibee",13725));
		e.add(new Employee("Bau", 62573));
		//System.out.println(e);
		
		// can you please check whether the salary of employee is greater than 3000 or not
		
		Predicate<Employee> p = e1->e1.salary>60000;
		for(Employee e2 : e)
		{
			if(p.test(e2))
			{
				System.out.println(e2.name+":"+e2.salary);
			}
		}
	}

}
