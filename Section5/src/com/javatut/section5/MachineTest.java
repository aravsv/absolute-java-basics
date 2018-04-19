package com.javatut.section5;

public class MachineTest {

	public static void main(String[] args) {
		
		Machine car = new Machine() {
			
			@Override
			public void stop() {
				System.out.println("Car stopped!!");
			}
			
			@Override
			public void start() {
				System.out.println("Car Started!!");
			}
		};
		
		car.start();
		car.stop();
		
		
		

	}

}
