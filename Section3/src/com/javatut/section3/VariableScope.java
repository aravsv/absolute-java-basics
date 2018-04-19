package com.javatut.section3;

public class VariableScope {

	public static void main(String[] args) {

		int value = 10;
		int number;
		
		if (value == 10) {
			
			number = 20;
			System.out.println(number);
			
		}
		
		number = 30;
		System.out.println(number);
		
	}

}
