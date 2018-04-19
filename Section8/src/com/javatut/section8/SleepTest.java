package com.javatut.section8;

public class SleepTest implements Runnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new SleepTest());
		t1.start();
		
		System.out.println("In main thread, after creating t1");
		
		Thread t2 = new Thread(new SleepTest());
		t2.start();
		
		System.out.println("In main thread, after creating t2");
		
	}

	@Override
	public void run() {
		
		System.out.println("In new thread, before sleep");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("In new thread, after sleep");
		
	}

}
