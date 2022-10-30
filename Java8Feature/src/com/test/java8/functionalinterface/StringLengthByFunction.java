package com.test.java8.functionalinterface;

import java.util.function.Function;

//Write a function that will take string as an argument and return the length of that string
public class StringLengthByFunction {

	
	public static void main(String[] args)
	{
		
		Function<String, Integer> f = i->i.length();
		System.out.println(f.apply("Saloni"));
	}
}
