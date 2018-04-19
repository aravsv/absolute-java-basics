package com.javatut.section8;

public class ThreadTest extends Thread {

	public static void main(String[] args) {

		ThreadTest t2 = new ThreadTest();
		t2.start();
		
		System.out.println("In main thread!!");
		
	}
	
	@Override
	public void run() {
		System.out.println("In new Thread!!");
	}

}
