package edu.handong.csee.java.lab13.prob6;//package name

public class DownPoint {//DownPoint class print String to low case
	private int x, y;//x and y integer variable

	DownPoint(int x,int y){//constructor DownPoint class
		this.x = x;//save input data to x
		this.y = y;//save input data to y
	}

	public String returnString() {//returnString class return String
		return "x : " + x + " y : " + y;//return string
	}

}
