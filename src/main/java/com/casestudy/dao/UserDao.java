package com.casestudy.dao;

import javax.persistence.Query;

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
			String qstring = "select u from User u where u.email = '" + email + "'";
			Query query = em.createQuery(qstring);
			User user = (User) query.getSingleResult();
			this.disconnect();
			System.out.println(user);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
