package edu.handong.csee.java.lab13.prob4;//package name

public class Dog extends Animal implements Pet{//Dog inherits class Animal and interface Pet 
	public String returnFood() {//returnFood method. it must conclude
		return "(Dog!)" + "Sausage";//return String
	}

}
