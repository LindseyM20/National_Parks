package com.casestudy.main;

import com.casestudy.dao.UserDao;
import com.casestudy.models.User;

public class Main {

	public static void main(String[] args) {
		UserDao uDao = new UserDao();
		
		User u1 = new User("Lindsey", "hello@world.com", "asdf");
		User u2 = new User("Dave", "funguy@fungi.com", "mush");
		User u3 = new User("Jax", "jaxy@thedog.com", "treats");
		uDao.addUser(u3);

	}
}
