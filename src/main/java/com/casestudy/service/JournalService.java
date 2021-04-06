package com.casestudy.service;

import com.casestudy.dao.JournalDao;
import com.casestudy.models.Journal;

public class JournalService {
	private JournalDao jDao = new JournalDao();
	
	public boolean addJournalService(Journal journal) {
		return jDao.addJournal(journal);
	}
	
	public Journal getJournalByIdService(int id) {
		return jDao.getJournalById(id);
	}
	
	public void updateJournalService(Journal journal) {
		jDao.updateJournal(journal);
	}
}
