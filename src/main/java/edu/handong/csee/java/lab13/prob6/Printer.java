package edu.handong.csee.java.lab13.prob6;//package name

public class Printer {//Printer class
	public static void print(Object object) {
		String str = object.toString();
		if(object instanceof CapitalPrint)
			str = str.toUpperCase();
		System.out.println(str);
	}

}
