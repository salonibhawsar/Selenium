package com.test.java8.predicateinterface;

import java.util.function.Predicate;

public class PredicateJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,34,55,98} ;
		Predicate<Integer> p1 = a1->a1%2==0;
		Predicate<Integer> p2 = a1->a1>10;
		
		//or() , and() , negate() ==> PredicateJoin
		
		System.out.println("The numbesr which are even and greater than 10 are");
		for(int a1:a)
		{
			
			/* if(p1.and(p2).test(a1)) { System.out.println("The numbers are :"+a1); } */
			 
			/*
			 * if(p1.or(p2).test(a1)) { System.out.println("The numbers are :"+a1); }
			 */
			
			if(p1.negate().test(a1))
			{
				System.out.println("The numbers are :"+a1);
			}
		}
		
		

	}

}
