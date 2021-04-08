package com.casestudy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Bucket_BeenId;
import com.casestudy.models.Journal;
import com.casestudy.models.User;
import com.casestudy.utilizes.Constants;


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

	// NEED TO REFACTOR THIS SO USER CAN UPDATE VISITED, VISIT_AGAIN, OR JOURNAL_ID
	// May need to split into 4 methods.
	@Override
	public Bucket_Been updateBBParkVisited(int park_id, int user_id) {
		// TODO Auto-generated method stub
		try {
			this.connect();
			em.getTransaction().begin();
			Bucket_Been bbParkFound = em.find(Bucket_Been.class, new Bucket_BeenId(park_id, user_id));
			bbParkFound.setVisited(true);
			System.out.println("PARK MOVED FROM BUCKET TO BEEN: " + bbParkFound);
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
	public Bucket_Been updateBBParkJournal(int park_id, int user_id, Journal journal) {
		try {
			this.connect();
			em.getTransaction().begin();
			Bucket_Been bbParkFound = em.find(Bucket_Been.class, new Bucket_BeenId(park_id, user_id));
			bbParkFound.setJournal_id(journal);
			System.out.println("JOURNAL ADDED/UPDATED TO PARK: " + bbParkFound);			
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

}
