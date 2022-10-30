/**
 * 
 */
package com.test.java8.methodreference;

/**
 * @author SALONI
 * 
 *         Constructor Reference ==> Test::new when metod return object we can
 *         go for constructor reference
 *
 */
class Sample {

	Sample() {
		System.out.println("No Arguments");
	}

	Sample(String s) {
		System.out.println("With Arrguments");
	}

}

interface Interf {

	// public Sample get();

	public Sample get(String s);

}

public class TestConstructorReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interf i = Sample::new;
		Sample s1 = i.get("Saloni");
		// Sample s2 = i.get();
		// Sample s3 = i.get();
	}

}
