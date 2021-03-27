package com.casestudy.dao;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.User;

public class UserDao extends DBConnection implements UserDaoI {
	public boolean addUser(User user) {
		try {
			this.connect();
			em.getTransaction().begin(); // For DDL and DML, we have to use getTransaction.
			em.persist(user);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public User findUserByEmail(String email) {
		try {
			this.connect();
			User user = em.find(User.class, email);
			this.disconnect();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// Maybe add a validateUser method in here so it's not happening in the controller
	// or put it in the service
}
