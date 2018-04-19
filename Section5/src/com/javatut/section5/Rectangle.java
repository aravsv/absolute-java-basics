package com.javatut.section5;

public class Rectangle extends Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double calculateArea() {
		double area = length * breadth;
		return area;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 2);
		System.out.println(rect.calculateArea());

		//Shape s = new Shape();
	}	
	
}
