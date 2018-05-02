package edu.handong.csee.java.lab13.prob3;//package name

public class Circle extends Shape{//Circle class and Inheritance Shape abstract class
	private double radius;//save radius

	public Circle(double r) {//Circle constructor
		radius = r;//save input data in radius
	}

	public double calculateArea() {//area method return double data
		return Math.PI * Math.pow(radius, 2);//return area of Circle
	}

	public double calculatePerimeter() {//perimeter method return double data
		return 2.0 * Math.PI*radius;//return perimeter of Circle
	}

	public double getRadius() {//getRadius method return radius
		return radius;//return radius
	}

}
