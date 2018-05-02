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
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter row size(maximum 5):");
		n1 = keyboard.nextInt();
		System.out.print("Enter column size(maximum 5):");
		n2 = keyboard.nextInt();
		
		int[][] m1 = new int [n1][n2];
		
		System.out.print("Enter row size(maximum 5):");
		n1 = keyboard.nextInt();
		System.out.print("Enter column size(maximum 5):");
		n2 = keyboard.nextInt();
		
		int[][] m2 = new int [n1][n2];
		
		System.out.print("Enter List1: ");
		for(int i =0; i< m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m1[i][j] = keyboard.nextInt();
			}
		 }
		
		System.out.print("Enter List2: ");
		for(int i =0; i< m2.length; i++) {
			for(int j=0; j<m2[i].length; j++)
				m2[i][j] = keyboard.nextInt();
		 }
		
		for(int i =0; i< m1.length; i++) {
			for(int j=0; j<m1[i].length; j++)
				System.out.print(m1[i][j]+" ");
				System.out.println();
		}
		System.out.println();
		
		for(int i =0; i< m2.length; i++) {
			for(int j=0; j<m2[i].length; j++)
				System.out.print(m2[i][j]+" ");
				System.out.println();
		}
		
		if(checkEquals(m1,m2))
			System.out.println("The two arrays are approximately identical");
		else
			System.out.println("The two arrays are not identical");
		
		
		}
			

}
