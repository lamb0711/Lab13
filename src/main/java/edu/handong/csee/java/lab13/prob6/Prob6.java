package edu.handong.csee.java.lab13.prob6;//package name

public class Prob6 {//Prob6 class

	public static void main(String[] args) {//main method
		UpPoint p1 = new UpPoint(3,3);//instantiation UpPoint to p1. and initialization
		DownPoint p2 = new DownPoint(2,5);//instantiation DownPoint p2. and initialization
		DownPoint p3 = new DownPoint(4,7);//instantiation DownPoint p3. and initialization
		UpPoint p4 = new UpPoint(9,12);//instantiation UpPoint to p4. and initialization
		Printer.print(p1);//call static print method in Printer to use p1
		Printer.print(p2);//call static print method in Printer to use p2
		Printer.print(p3);//call static print method in Printer to use p3
		Printer.print(p4);//call static print method in Printer to use p4

	}

}
