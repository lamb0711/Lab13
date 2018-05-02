package edu.handong.csee.java.lab13.prob6;//package name

public class UpPoint implements CapitalPrint{//UpPoint class it use interface CapitalPrint
	private int x, y;//x and y integer variable

	UpPoint(int x,int y){//constructor UpPoint
		this.x = x;//save input data to x
		this.y = y;//save input data to y
	}

	public String returnString() {//returnString class return String
		return "x : " + x + " y : " + y;//return string
	}

}
