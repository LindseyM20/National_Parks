package com.casestudy.dao;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.Journal;

public class JournalDao extends DBConnection implements JournalDaoI {
	public Journal getJournalById(int id) {
		this.connect();
		Journal journal = em.find(Journal.class, id);
		this.disconnect();
		return journal;
	}
}
