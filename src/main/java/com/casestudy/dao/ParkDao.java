package com.casestudy.dao;

import java.util.List;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.Park;
import com.casestudy.utilizes.Constants;

public class ParkDao extends DBConnection implements ParkDaoI {
	Constants constants = new Constants();
	
	@Override
	public Park getParkById(int id) {
		try {
			this.connect();
			Park park = em.find(Park.class, id);
			this.disconnect();
			return park;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Park> getAllParks() {
		try {
			this.connect();
			List<Park> parks = em.createQuery(constants.PARKS_QUERY).getResultList();
			this.disconnect();
			return parks;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
