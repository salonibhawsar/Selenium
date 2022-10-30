package com.inn.demo;

// Counting Vowel using Sgtream API

public class CountVowelUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// global variables
		long VOWELS = 0;
		long CONSONANTS = 0;

		String str = "Hello , I am Saloni Bhawsar";

		// replace all spaces - ignore space characters
		str = str.replaceAll(" ", "");

		// count vowels
		VOWELS = str // original source or string
				.chars() // get character stream
				.filter(ch -> ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch || 'A' == ch || 'E' == ch
						|| 'I' == ch || 'O' == ch || 'U' == ch)) // filter out vowels
				.count(); // count vowels

		// count consonants
		CONSONANTS = str // original source or string
				.chars() // get character stream
				.filter(ch -> (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) // check whether it is in range
				.filter(ch -> ('a' != ch && 'e' != ch && 'i' != ch && 'o' != ch && 'u' != ch && 'A' != ch && 'E' != ch
						&& 'I' != ch && 'O' != ch && 'U' != ch)) // filter out non-vowels
				.count(); // count consonants

		System.out.println(VOWELS);
		System.out.println(CONSONANTS);
	}

}
