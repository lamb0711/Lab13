package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	
	public static void whatFriend(Friend friend) {
		
		if(friend instanceof ClassFriend)
			( (ClassFriend)friend).classFriend();
		
		else if(friend instanceof SchoolFriend)
				( (SchoolFriend)friend).schoolFriend();
		
		else
			friend.justFriend();
			
	}

	public static void main(String[] args) {
		Friend friend1 = new Friend();
		SchoolFriend friend2 = new SchoolFriend();
		ClassFriend friend3 = new ClassFriend();
		
		InstanceOf.whatFriend(friend1);
		InstanceOf.whatFriend(friend2);
		InstanceOf.whatFriend(friend3);
		
		

	}

}
