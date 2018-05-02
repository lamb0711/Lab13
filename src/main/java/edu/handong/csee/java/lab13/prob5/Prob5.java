package edu.handong.csee.java.lab13.prob5;//package name

import java.util.Scanner;//use scanner class

public class Prob5 {//Prob5 class
	public static boolean checkEquals(int[][] m1, int [][] m2) {//checkEquals class accept two array and compare they
		int count = 0;//count different variable between m1 and m2
		if(m1.length != m2.length)//if array length of m1 and m2 are different implement this 
			return false;//return false
		for(int i =0; i< m1.length; i++) {//loop during length of m1 row
			for(int j=0; j<m1[i].length; j++) {//loop during length of m1 column
				if(m1[i][j] != m2[i][j]) count ++;//if m1 variable and m2 variable same, add 1 to count variable
			}
		}
		if(count <= 3)//if count less than 3, implement this
			return true;//return true
		else return false;//if count more than 4, implement it
	}

	public static void main(String[] args) {//main method
		int n1, n2 = 0;//save row and column variable
		Scanner keyboard = new Scanner(System.in);//use scanner class to use keyboard 
		System.out.print("Enter row size(maximum 5):");//print message to input row data on m1
		n1 = keyboard.nextInt();//save input data in n1
		System.out.print("Enter column size(maximum 5):");//print message to input column data on m1
		n2 = keyboard.nextInt();//save input data in n2

		int[][] m1 = new int [n1][n2];//make new array m1. this size is made of input data

		System.out.print("Enter row size(maximum 5):");//print message to input row data on m2
		n1 = keyboard.nextInt();//save input data in n1
		System.out.print("Enter column size(maximum 5):");//print message to input column data on m2
		n2 = keyboard.nextInt();//save input data in n2

		int[][] m2 = new int [n1][n2];//make new array m2. this size is made of input data

		System.out.print("Enter List1: ");//print message for input variables of m1
		for(int i =0; i< m1.length; i++) {//loop during length of m1 row
			for(int j=0; j<m1[i].length; j++) {//loop during length of m1 column
				m1[i][j] = keyboard.nextInt();//save input data
			}
		}

		System.out.print("Enter List2: ");//print message for input variables of m2
		for(int i =0; i< m2.length; i++) {//loop during length of m2 row
			for(int j=0; j<m2[i].length; j++)//loop during length of m2 column
				m2[i][j] = keyboard.nextInt();//save input data
		}

		for(int i =0; i< m1.length; i++) {//loop during length of m1 row
			for(int j=0; j<m1[i].length; j++)//loop during length of m1 column
				System.out.print(m1[i][j]+" ");//print variables row of m1
			System.out.println();//print empty space for distinguish m1 row 
		}

		System.out.println();//print empty space of distinguish m1 and m2

		for(int i =0; i< m2.length; i++) {//loop during length of m2 row
			for(int j=0; j<m2[i].length; j++)//loop during length of m2 column
				System.out.print(m2[i][j]+" ");//print variables row of m2
			System.out.println();//print empty space for distinguish m2 row 
		}

		System.out.println();//print empty space

		if(checkEquals(m1,m2))//if checkEquals method return true, implement it
			System.out.println("The two arrays are approximately identical");//print message to inform m1 and m2 are similar
		else//if chechEquals method return false, implement it
			System.out.println("The two arrays are not identical");//print message to inform m1 and m2 is not similar


	}


}
