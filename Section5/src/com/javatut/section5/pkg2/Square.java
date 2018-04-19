package com.javatut.section5.pkg2;

public class Square implements Shape, Position {

	private double length;
	
	public Square(double length) {
		this.length = length;
	}
	
	@Override
	public double calculateArea() {
		double area = length * length;
		return area;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void displayPosition() {
	}
	
	

}
