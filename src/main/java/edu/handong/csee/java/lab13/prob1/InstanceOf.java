package edu.handong.csee.java.lab13.prob1;//package name

public class InstanceOf {//class name 
	
	public static void whatFriend(Friend friend) {//whatFriend is static method! and it accept data to Friend class type
		
		if(friend instanceof ClassFriend)//if friend can change to ClassFriend class type, return true 
			( (ClassFriend)friend).classFriend();//change friend to ClassFriend class type and call classFriend method
		
		else if(friend instanceof SchoolFriend)//if friend can change to SchoolFriend class type, return true 
				( (SchoolFriend)friend).schoolFriend();//change friend to SchoolFriend class type and call schoolFriend method
		
		else//if friend can't change to ClassFriend and SchoolFriend class type, return true 
			friend.justFriend();//call classFriend method in Friend class
			
	}


}
