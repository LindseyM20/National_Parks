package com.casestudy.dao;

import java.util.List;

import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Journal;
import com.casestudy.models.User;

public interface Bucket_BeenDaoI {
	public boolean addBBPark(Bucket_Been bbPark);
	public Bucket_Been getBBPark(int park_id, int user_id);	
	public Bucket_Been updateBBParkVisited(int park_id, int user_id);	// Needed for updating the visited & visit_again columns, & adding or deleting journal
	public Bucket_Been updateBBParkJournal(int park_id, int user_id, Journal journal);
//	public Bucket_Been updateBBPark(int park_id, int user_id);	// Needed for updating the visited & visit_again columns, & adding or deleting journal
	public boolean deleteBBPark(int park_id, int user_id);	
//	public List<Bucket_Been> getAllBBParks(); // Probably don't need
	
	// Might need a "get all been parks by user" / getUserBeen
	// moved these to service
//	public List<Bucket_Been> getUserBeen(int user_id);
//	public List<Bucket_Been> getUserBucket(int user_id);
}
