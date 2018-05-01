package edu.handong.csee.java.lab13.prob3;//package name

public class Rectangle extends Shape{//Rectangle class and Inheritance Shape abstract class
	private double length = 0;//save length
	private double width = 0;//save width

	public Rectangle(double length, double width ) {//Rectangle constructor
		this.length = length;//save input data to length
		this.width = width;//save input data to width
	}

	public double area() {//area method return double data
		return length*width;//return area of rectangle
	}

	public double perimeter() {//perimeter method return double data
		return 2*length+2*width;//return perimeter of rectangle
	}

	public double getLength() {//getLength method return length
		return length;//return length
	}

	public double getWidth() {//getLength method return width
		return width;//return width
	}

}
