package com.javatut.section3;

public class ForLoop {

	public static void main(String[] args) {
		
		int[] numbers = {22, 34, 54, 55, 66, 78, 76, 99};
		
		//for (int i = 0; i < numbers.length ;i++) {
		//	System.out.println(numbers[i]);
		//}

		
		//Enhanced For Loop
		for (int number : numbers) {
			System.out.println(number);
		}
		
	}

}
