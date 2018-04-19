package com.javatut.section2;

public class MethodTest {

	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 20;
		
		//int result = number1 + number2;
		int result = calculate(number1, number2);
		System.out.println(result);
		result = calculate(number1, number2);
		System.out.println(result);
		result = calculate(number1, number2);
		System.out.println(result);		

	}
	
	public static int calculate(int num1, int num2) {
		int result2 = num1 * num2;
		return result2;
	}

}
