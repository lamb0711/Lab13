package edu.handong.csee.java.lab13.prob2;//package name

public class History extends Book{//History class. it inheritance Book class
	private String author;//save author name

	public History(String name, String author) {//History constructor. it inheritance Book class
		super(name);////name save to Book class
		this.author = author;//input data save author of class variable
	}

	public String toStirng() {//toString method return String variable
		return super.toString() + "\n\tAuthor: " + author;//return toString in Book class and this.author
	}

	public void show() {//print message method
		System.out.println("<<<History>>>" + this.toStirng());//print message to use toString method
	}
}
