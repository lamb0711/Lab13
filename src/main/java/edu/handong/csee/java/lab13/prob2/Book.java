package edu.handong.csee.java.lab13.prob2;//package name

public class Book {//Book class
	private static int idCount = 0;//declare static variable idCount
	private String bookName;//save book name string
	private int id;//save id number

	public Book(String name) {//Book constructor. it accept book name string
		this.bookName = name;//save input data to book name
		idCount++;//add idCount integer variable
		id = idCount;//save static idCount to id class variable
	}

	public String printToString() {//toString method. it return String variable
		return "\n\tId: " + id + "\n\tBook Name:" + bookName;//return this string with class variable
	}

	public void showString() {//show method. it print message to use to String method
		System.out.println("<<<Book>>>" + this.toString());//print out string and toString method string
	}

}
