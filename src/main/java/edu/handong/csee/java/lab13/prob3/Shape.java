package edu.handong.csee.java.lab13.prob3;//package name

public abstract class Shape {//abstract class Shape. It have method of heading. it don't need instantiation
	public abstract double area();//It is abstract method so it must declare in subclass
	public abstract double perimeter();//It is abstract method so it must declare in subclass
	public void display() {//display method
		System.out.println("Area: "+area()+ "\nPerimeter" + perimeter()+ "\n");//print area and perimeter
	}

}
