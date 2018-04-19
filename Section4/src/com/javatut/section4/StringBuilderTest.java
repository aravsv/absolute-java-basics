package com.javatut.section4;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String name = "John";
		
		StringBuilder name2 = new StringBuilder(name);
		
		name2.append(" Programmer");
		
		name2.reverse();
		
		System.out.println(name2);

	}

}
