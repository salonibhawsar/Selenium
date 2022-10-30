/**
 * 
 */
package com.test.java8.methodreference;

/**
 * @author SALONI
 * 
 *         Method refernce is an alternative of lambda expression.
 *         By using static method we can call method via class name --> classname :: methodname
 *         By using instance method object reference is required --> object:: methodname
 *         Rule : complusory the arguments of method must be same.dffrnt return type is acceptable.
 *         
 *         
 *
 */
public class TestMethodReference {

	/**
	 * @param args
	 * @return
	 */

	// using method refernce 
	/*
	 * public void m1() { for (int i = 0; i <= 10; i++) {
	 * System.out.println("This is Child Thread"); } }
	 */
	
	//different retuen type are allowed but only restriction argument type muse be matched
	public  int m1() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("This is Child Thread");
		}
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using lamplda expression implementing run()
		/*
		 * Runnable r = () -> { for (int i = 0; i <= 10; i++) {
		 * System.out.println("This is Child Thread"); }
		 * 
		 * };
		 */
		
	//	Runnable r =  TestMethodReference :: m1 ; //using  static method reference
		TestMethodReference tr = new  TestMethodReference()  ;
		Runnable r =   tr :: m1 ; // using instance method -> object refrnce is required
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("This is Main Thread");
		}

	}

}
