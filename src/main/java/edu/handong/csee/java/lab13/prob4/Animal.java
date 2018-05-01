package edu.handong.csee.java.lab13.prob4;//package name

public class Animal {//Animal class
	private String name;//save animal name

	public void setName(String name) {//setting input data to name
		this.name = name;//save input data name to name class variable
	}

	public void getName() {//print name data
		System.out.println("Name: "+name);//print name
	}
}
