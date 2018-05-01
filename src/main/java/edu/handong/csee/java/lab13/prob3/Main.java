package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double n1,n2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		n1 = keyboard.nextDouble();
		Circle c1 = new Circle(n1);
		
		System.out.println("Radius: " + c1.getRadius());
		c1.display();

	}

}
