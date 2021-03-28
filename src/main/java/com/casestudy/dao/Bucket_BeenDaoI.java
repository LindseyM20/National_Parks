package com.casestudy.dao;

import java.util.List;

import com.casestudy.models.Bucket_Been;

public interface Bucket_BeenDaoI {
	public boolean addBBPark(Bucket_Been bbPark);
	public Bucket_Been getBBPark(int park_id, int user_id);		// Probably don't need
	public Bucket_Been updateBBPark(int park_id, int user_id);	// Needed for updating the visited & visit_again columns
	public boolean deleteBBPark(int park_id, int user_id);	
//	public List<Bucket_Been> getAllBBParks(); // Probably don't need
	
	// Might need a "get all been parks by user" / getUserBeen
	public List<Bucket_Been> getUserBeen(int user_id);
	// Might need a "get all bucket parks by user" / getUserBucket
}
