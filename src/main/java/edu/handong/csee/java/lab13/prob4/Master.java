package edu.handong.csee.java.lab13.prob4;//package name

import java.util.Scanner;//use scanner class

public class Master {//Master class
	public void eatFeed(Pet pet) {//it print feed of animal of Pet type
		System.out.println("feed: "+pet.returnFood());//print feed of animal to use returnFood method
	}
	
	public static void main(String[] args) {//main method
		String catName, dogName;//they save cat name and dog name
		
		Master master = new Master();//instantiation Mater class
		Cat cat = new Cat();//instantiation Cat class
		Dog dog = new Dog();//instantiation Dog class
		
		Scanner keyboard = new Scanner(System.in);//use scanner class to use keyboard
		System.out.print("Enter the cat name and dog name! ");//print message for input data
		catName = keyboard.next();//save input data to catName
		dogName = keyboard.next();//save input data to dogName
		
		cat.setName(catName);//save catName to cat super class Animal
		cat.getName();//print cat name to use super class Animal
		master.eatFeed(cat);//call eatFeed method and pass on cat instance.
		
		dog.setName(dogName);//save dogName to cat super class Animal
		dog.getName();//print dog name to use super class Animal
		master.eatFeed(dog);//call eatFeed method and pass on dog instance.
	}

}
