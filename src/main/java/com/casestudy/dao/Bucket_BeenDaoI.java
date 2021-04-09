package com.casestudy.dao;

import java.util.List;

import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Journal;
import com.casestudy.models.User;

public interface Bucket_BeenDaoI {
	public boolean addBBPark(Bucket_Been bbPark);
	public Bucket_Been getBBPark(int park_id, int user_id);	
	public boolean updateBBParkVisited(int park_id, int user_id);
	public boolean updateBBParkJournal(int park_id, int user_id, Journal journal);
	public boolean deleteBBPark(int park_id, int user_id);	
}
