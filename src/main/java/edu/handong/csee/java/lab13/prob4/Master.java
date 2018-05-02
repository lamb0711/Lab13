package edu.handong.csee.java.lab13.prob4;//package name

import java.util.Scanner;

public class Master {
	public void eatFeed(Pet pet) {
		System.out.println("feed: "+pet.returnFood());
	}
	
	public static void main(String[] args) {
		String catName, dogName;
		
		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the cat name and dog name! ");
		catName = keyboard.next();
		dogName = keyboard.next();
	}

}
