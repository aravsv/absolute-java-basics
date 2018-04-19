package com.javatut.section4;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "John";
		String title = "Programmer";
		
		String result = name + " " + title;
		
		String newResult = result;
		
		//result = "123";
		result = "JOHN Programmer";
		System.out.println(result);
		System.out.println(newResult);
		
		System.out.println(newResult.length());
		
		if (result.equals(newResult)) {
			System.out.println("The strings are the same");
		}

	}

}
