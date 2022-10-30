/**
 * 
 */
package com.test.java8.supplierinterface;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author SALONI
 
 SUPPLIER --> wont take input and returns output.its method get()
 */
public class TestSupplier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//normal example to print system date
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());
		
		
		//Supplier for random OTP 
		Supplier<String> s1 = ()-> {
			String otp = "";
			for(int i=0;i<6;i++)
			{
				otp=otp+(int) Math.random()*10;
			}
			return otp;
		};
		System.out.println(s1.get());
		//System.out.println();
		
	}

}
