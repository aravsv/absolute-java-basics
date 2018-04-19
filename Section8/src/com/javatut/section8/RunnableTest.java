package com.javatut.section8;

public class RunnableTest implements Runnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnableTest());
		t1.start();
		
		System.out.println("In Main Thread!!");
	}

	@Override
	public void run() {
		System.out.println("In new thread!!!");
	}

}
