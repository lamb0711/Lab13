package edu.handong.csee.java.lab13.prob1;//package name

public class Prob1 {//main class Prob1

	public static void main(String[] args) {//main method
		Friend friend1 = new Friend();//instantiation Friend class
		SchoolFriend friend2 = new SchoolFriend();//instantiation SchoolFriend class
		ClassFriend friend3 = new ClassFriend();//instantiation ClassFriend class

		InstanceOf.distinguishWhatFriend(friend1);//call class method whatFrend in InstanceOf class
		InstanceOf.distinguishWhatFriend(friend2);//call class method whatFrend in InstanceOf class
		InstanceOf.distinguishWhatFriend(friend3);//call class method whatFrend in InstanceOf class

	}

}
