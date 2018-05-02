package edu.handong.csee.java.lab13.prob6;//package name

public class Printer {//Printer class
	public static void print(Object object) {//static method print. it accept input data to Object type
		String str = object.toString();//change object variables to string and save str
		if(object instanceof CapitalPrint)//if object implement CapitalPrint interface, implements it
			str = str.toUpperCase();//change string to upper case and save it to str
		System.out.println(str);//print str
	}

}
