package com.casestudy.service;

import java.util.List;

import com.casestudy.dao.Bucket_BeenDao;
import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Journal;
import com.casestudy.models.User;
import com.casestudy.utilizes.Constants;

public class Bucket_BeenService extends DBConnection {
	Constants constants = new Constants();
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
	
	public void updateBBParkJournalService(int park_id, int user_id, Journal journal) {
		bbDao.updateBBParkJournal(park_id, user_id, journal);
	}

	public void deleteBBParkService(int park_id, int user_id) {
		bbDao.deleteBBPark(park_id, user_id);
	}
	
	// This retrieves a user's Been List
	public List<Bucket_Been> getUserBeen(int user_id) {
		this.connect();
		String query = constants.BB_QUERY + user_id + constants.BB_QUERY_VISITED;
		List<Bucket_Been> beenParks = em.createQuery(query).getResultList();
		this.disconnect();
		for (Bucket_Been park: beenParks) {
			System.out.println(park);
		}
		return beenParks;
	};
	
	// This retrieves a user's Bucket List
	public List<Bucket_Been> getUserBucket(int user_id) {
		this.connect();
		String query = constants.BB_QUERY + user_id + constants.BB_QUERY_UNVISITED;
		List<Bucket_Been> bucketParks = em.createQuery(query).getResultList();
		this.disconnect();
		for (Bucket_Been park: bucketParks) {
			System.out.println(park);
		}
		return bucketParks;
	};
	
}
