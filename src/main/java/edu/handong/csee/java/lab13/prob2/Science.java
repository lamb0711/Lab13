package edu.handong.csee.java.lab13.prob2;//package name

public class Science extends Book {//Science constructor. it inheritance Book class
	private String publisher;//declare private variable
	public Science(String name, String publisher) {//constructor. it input name and publisher string data 
		super(name);//name save to Book class
		this.publisher = publisher;//input data save publisher of class variable
	}

	public String toString() {//toString method return String variable
		return super.toString() + "\n\tPublisher: " + publisher;//return toString in Book class and this.publisher

	}

	public void show() {//show is print message method
		System.out.println("<<<Sciendce>>>" + this.toString());//print message to use toString method

	}
}
