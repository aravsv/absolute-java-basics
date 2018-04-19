package com.javatut.section5;

public abstract class Shape {
	
	public String fillColor;
	public String borderColor;
	
	public abstract double calculateArea();
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	
	public void displayShapeName() {
		System.out.println("I am a shape!!!");
	}

}
