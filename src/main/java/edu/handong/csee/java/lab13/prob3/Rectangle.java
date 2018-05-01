package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{
	private double length = 0;
	private double width = 0;
	
	public void Rectangle(double length, double width ) {//Rectangle constructor
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
	
	public double parameter() {
		return 2*length+2*width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}

	
	
	
}
