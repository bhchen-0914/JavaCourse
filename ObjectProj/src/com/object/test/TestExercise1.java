package com.object.test;

import com.object.exercise1.*;

public class TestExercise1 {

	public static void main(String[] args) {
		User user1=new User("Lucy", "123456");
		User user2=new User("Mike", "123456");
		UserManager userManager=new UserManager();
		
		UserManager.showMessage(user1);
		UserManager.showMessage(user2);
		System.out.println("==================================");
		System.out.println(userManager.checkUser(user1, user2));
	}

}
