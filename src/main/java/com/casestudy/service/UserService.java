package com.casestudy.service;

import com.casestudy.dao.UserDao;
import com.casestudy.models.User;

public class UserService {
	private UserDao uDao = new UserDao();
	
	public void addUserService(User user) {
		uDao.addUser(user);
	}	
	
	public User findUserByEmailService(String email) {
		return uDao.findUserByEmail(email);
	}
	
	public boolean validateEmpService(String email, String password) {
		User uFound = uDao.findUserByEmail(email);
		if (uFound!=null) {
			if (uFound.getEmail().equals(email) && uFound.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}
