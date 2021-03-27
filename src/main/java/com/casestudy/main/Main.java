package com.casestudy.main;

import com.casestudy.models.User;
import com.casestudy.service.UserService;

public class Main {

	public static void main(String[] args) {
		UserService USer = new UserService();
		
		User u1 = new User("Lindsey", "hello@world.com", "asdf");
		User u2 = new User("Dave", "funguy@fungi.com", "mush");
		User u3 = new User("Jax", "jaxy@thedog.com", "treats");
		User u4 = new User("Bonnie", "bon@thedog.com", "naps");
		USer.addUserService(u1);
		USer.addUserService(u2);
		USer.addUserService(u3);
		USer.addUserService(u4);

	}
}
