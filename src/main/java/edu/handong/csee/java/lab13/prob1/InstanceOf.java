package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	
	public static void WhatFriend(Friend friend) {
		if(friend instanceof ClassFriend)
			((ClassFriend)friend).classFriend();
		
			
	}

	public static void main(String[] args) {
		Friend friend1 = new Friend();
		SchoolFriend friend2 = new SchoolFriend();
		ClassFriend friend3 = new ClassFriend();
		
		InstanceOf.WhatFriend(friend1);

	}

}
