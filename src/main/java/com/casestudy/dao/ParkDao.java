package com.casestudy.dao;

import java.util.List;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.Park;

public class ParkDao extends DBConnection implements ParkDaoI {
	
	@Override
	public List<Park> getAllParks() {
		try {
			this.connect();
			List<Park> parks = em.createQuery("select p from Park p").getResultList();
			this.disconnect();
			return parks;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
