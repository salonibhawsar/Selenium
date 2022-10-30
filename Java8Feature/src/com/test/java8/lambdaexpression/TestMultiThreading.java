package com.test.java8.lambdaexpression;

/*class MyRunnable implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");  //without lambda
		}
	}
	
}*/

public class TestMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyRunnable r = new MyRunnable();
		
		Runnable r = ()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread"); //with lambda expression
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
