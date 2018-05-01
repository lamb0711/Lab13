package edu.handong.csee.java.lab13.prob3;//package name

import java.util.Scanner;//use scanner class

public class Main {//Main class

	public static void main(String[] args) {//main method
		double n1,n2;//double variable n1, n2
		Scanner keyboard = new Scanner(System.in);//use scanner class to use keyboard

		System.out.print("Enter radius: ");//print enter message
		n1 = keyboard.nextDouble();//save input data to n1
		Circle c1 = new Circle(n1);//instantiation Circle class to c1

		System.out.println("Radius: " + c1.getRadius());//print radius to use getRadius method
		c1.display();//display result to use display method

		System.out.print("Enter length and width: ");//print message to input data
		n1 = keyboard.nextDouble();//save input data to n1
		n2 = keyboard.nextDouble();//save input data to n2
		Rectangle r1 = new Rectangle(n1,n2);//instantiation Rectangle class to r1

		System.out.println("Length: " + r1.getLength());//print Length to use getLength method
		System.out.println("Width: " + r1.getWidth());//print Width to use getWidth method
		r1.display();//display result to use display method

	}

}
