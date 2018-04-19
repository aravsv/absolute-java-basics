package com.javatut.section5;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void displayShapeName() {
		System.out.println("I am a circle!!!");
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(22.0);
		System.out.println(circle.calculateArea());
		circle.displayShapeName();
		//circle.get
	}
	
}
