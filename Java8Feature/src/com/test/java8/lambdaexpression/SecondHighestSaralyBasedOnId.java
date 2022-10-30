package com.test.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

class Employee1
{

	int id ;
	double salary ;
	
	Employee1(int i , double d)
	{
		this.id=i;
		this.salary=d;
	}
	
	public String toString()
	{
		return id+":"+salary;
	}
}

public class SecondHighestSaralyBasedOnId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		l.add(new Employee1( 91 , 2508.22));
		l.add(new Employee1( 3648 , 753508.12));
		l.add(new Employee1( 47 , 26768508.22));
		l.add(new Employee1( 123 , 122508.22));
		System.out.println(l);
		
		Collections.sort(l,(l1,l2)->(l1.id<l2.id)?-1:(l1.id>l2.id)?1:0);
		System.out.println(l);

	}

}
