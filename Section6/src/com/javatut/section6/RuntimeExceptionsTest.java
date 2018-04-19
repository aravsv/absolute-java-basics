package com.javatut.section6;

public class RuntimeExceptionsTest {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3};
		
		try {
			System.out.println(numbers[5]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out of bounds!!");
		}
		
		String name = null;
		
		//System.out.println(name.length());

	}

}
