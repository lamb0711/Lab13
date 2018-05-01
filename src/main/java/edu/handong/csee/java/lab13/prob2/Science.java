package edu.handong.csee.java.lab13.prob2;//package name

public class Science extends Book {//Science class. it inheritance Book class
	private String publisher;//declare private variable
	public Science(String name, String publisher) {//constructor. it input name and publisher string data 
		super(name);//name save to Book class
		this.publisher = publisher;//input data save publisher of class variable
	}
}
