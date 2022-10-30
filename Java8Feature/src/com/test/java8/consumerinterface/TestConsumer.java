/**
 * 
 */
package com.test.java8.consumerinterface;

import java.util.function.Consumer;

/**
 * @author SALONI
 *
 CONSUMER<T> === > return type is void
 Method : accept();
 */
public class TestConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c = s->System.out.println(s);
		c.accept("Saloni");
		c.accept("Tuktuk");
		c.accept("Bebo");
	}

}
