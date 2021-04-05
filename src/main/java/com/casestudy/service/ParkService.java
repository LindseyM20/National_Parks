package com.casestudy.service;

import java.util.List;

import com.casestudy.dao.ParkDao;
import com.casestudy.models.Park;

public class ParkService {
	private ParkDao pDao = new ParkDao();

	public List<Park> getAllParksService() {
		return pDao.getAllParks();
	}
	
	public Park getParkByIdService(int id) {
		return pDao.getParkById(id);
	}
}
