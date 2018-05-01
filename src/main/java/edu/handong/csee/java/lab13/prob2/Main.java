package edu.handong.csee.java.lab13.prob2;//package name

public class Main {//Main class
	
	public static void main(String[] args) {//main method
		Book book = new Book("Simple Book");//instantiation Book class and input data;
		Science science = new Science("Hello Physics!", "ScienceWorld");//instantiation Science class and input data
		History history1 = new History("what Is history?", "E.H.Carr");//instantiation History class and input data
		book.show();//call method in book
		science.show();//call method in science
		history1.show();//call method in history1
	}
}
