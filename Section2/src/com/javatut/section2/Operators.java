package com.javatut.section2;

public class Operators {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 2;
		
		//Addition
		int add = num1 + num2;
		System.out.println("add = " + add);
		
		//Subtraction
		int sub = num1 - num2;
		System.out.println("sub = " + sub);
		
		//Multiplication
		int mul = num1 * num2;
		System.out.println("mul = " + mul);
		
		//Division
		int div = num1 / num2;
		System.out.println("div = " + div);
		
		//Modulus/Remainder
		int mod = num1 % num2;
		System.out.println("mod = " + mod);
		
		//Increment Operation 1
		int num3 = 10;
		num3++;
		System.out.println("Increment Operation 1 : num3 = " + num3);
		
		//Increment Operation 2
		++num3;
		System.out.println("Increment Operation 2 : num3 = " + num3);
		//Note: There are decrement operators as well, like num3-- and --num3
		
		//Increment Operation 1 - within an expression
		int num4 = 5;
		int num5 = 2 * (num4++);
		System.out.println("Increment Operation 1 - within an expression : num5 = " + num5);
		
		//Increment Operation 2 - within an expression
		int num6 = 5;
		int num7 = 2 * (++num6);
		System.out.println("Increment Operation 2 - within an expression : num7 = " + num7);
		
		//Compound Assignment Operators
		int num8 = 8;
		//num8 = num8 * 10;
		num8 *= 10;
		System.out.println("Compound Operation : num8 = " + num8);
		//Note: These are the other compound assignment operators : +=, -=, /=, %= 
		
	}

}
