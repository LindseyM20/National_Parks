package com.casestudy.dao;

import java.util.List;

import com.casestudy.models.User;

public interface UserDaoI {
	public boolean addUser(User user);
	public User findUserByEmail(String email);
//	public User updateUser(User user);	// Only would need for password reset or email change
//	public boolean deleteUser(int id);	// Probably don't need
//	public List<User> getAllUsers(); 	// Probably don't need
}
