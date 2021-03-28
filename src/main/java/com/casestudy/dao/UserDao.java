package com.casestudy.dao;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.User;

public class UserDao extends DBConnection implements UserDaoI {
	
	@Override
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
	
	@Override
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
	
	// validateUser method is in the service
}
