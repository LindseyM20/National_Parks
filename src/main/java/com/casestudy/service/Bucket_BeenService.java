package com.casestudy.service;

import java.util.List;

import com.casestudy.dao.Bucket_BeenDao;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.User;

public class Bucket_BeenService {
	private Bucket_BeenDao bbDao = new Bucket_BeenDao();
	
	public void addBBParkService(Bucket_Been bbPark) {
		bbDao.addBBPark(bbPark);
	}
	
	public Bucket_Been getBBParkService(int park_id, int user_id) {
		return bbDao.getBBPark(park_id, user_id);
	}

	public void updateBBParkVisitedService(int park_id, int user_id) {
		bbDao.updateBBParkVisited(park_id, user_id);
	}

	public void deleteBBParkService(int park_id, int user_id) {
		bbDao.deleteBBPark(park_id, user_id);
	}
	
	
	
	public List<Bucket_Been> getUserBeenService(int user_id) {
		return bbDao.getUserBeen(user_id);
	};
	
	public List<Bucket_Been> getUserBucketService(int user_id) {
		return bbDao.getUserBucket(user_id);
	};
	
	
	
}
