package com.javatut.section2;

public class Casting {

	public static void main(String[] args) {

		int aInt = 20;
		long aLong = aInt;
		aLong = 2999999999999999L;
		int aInt2 = (int) aLong;
		
		System.out.println("aInt2 is " + aInt2);
		
		double aDouble = 2.6767676767;
		float aFloat = (float) aDouble;
		System.out.println("aFloat is " + aFloat);
		
	}

}
