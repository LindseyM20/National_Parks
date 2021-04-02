package com.casestudy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Bucket_BeenId;
import com.casestudy.models.User;


public class Bucket_BeenDao extends DBConnection implements Bucket_BeenDaoI {

	@Override
	public boolean addBBPark(Bucket_Been bbPark) {
		try {
			this.connect();
			em.getTransaction().begin();
			em.persist(bbPark);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public Bucket_Been getBBPark(int park_id, int user_id) {
		this.connect();
		Bucket_Been bbParkFound = em.find(Bucket_Been.class, new Bucket_BeenId(park_id, user_id));
		this.disconnect();
		System.out.println(bbParkFound);
		return bbParkFound;
	}

	// NEED TO REFACTOR THIS SO USER CAN UPDATE VISITED, VISIT_AGAIN, DATE_VISITED, OR JOURNAL_ID
	// May need to split into 4 methods.
	@Override
	public Bucket_Been updateBBPark(int park_id, int user_id) {
		// TODO Auto-generated method stub
		try {
			this.connect();
			em.getTransaction().begin();
			Bucket_Been bbParkFound = em.find(Bucket_Been.class, new Bucket_BeenId(park_id, user_id));
//			bbParkFound.setVisited(put something here);
//			bbParkFound.setVisit_again(put something here);
//			bbParkFound.setDate_visited(put something here);
//			bbParkFound.setJournal_id(put something here);
			em.getTransaction().commit();
			this.disconnect();
			return bbParkFound;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean deleteBBPark(int park_id, int user_id) {
		try {
			this.connect();
			em.getTransaction().begin();
			Bucket_Been bbParkFound = em.find(Bucket_Been.class, new Bucket_BeenId(park_id, user_id));
			em.remove(bbParkFound);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	@Override
	public List<Bucket_Been> getUserBeen(int user_id) {
		this.connect();
		String query = "select bb from Bucket_Been bb where bb.primaryKey.user_id = " + user_id + " and bb.visited = 1";
		List<Bucket_Been> beenParks = em.createQuery(query).getResultList();
		this.disconnect();
		for (Bucket_Been park: beenParks) {
			System.out.println(park);
		}
		return beenParks;
	};
	
	@Override
	public List<Bucket_Been> getUserBucket(int user_id) {
		this.connect();
		String query = "select bb from Bucket_Been bb where bb.primaryKey.user_id = " + user_id + " and bb.visited = 0";
		String query2 = "select bb from Bucket_Been bb where bb.primaryKey.user_id = " + user_id + " and bb.visited = 1 and bb.visit_again = 1";
		List<Bucket_Been> bucketParks = em.createQuery(query).getResultList();
		bucketParks.addAll(em.createQuery(query2).getResultList());
		this.disconnect();
		for (Bucket_Been park: bucketParks) {
			System.out.println(park);
		}
		return bucketParks;
	};

}
