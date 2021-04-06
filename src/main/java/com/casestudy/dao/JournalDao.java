package com.casestudy.dao;

import com.casestudy.dbConnection.DBConnection;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Bucket_BeenId;
import com.casestudy.models.Journal;

public class JournalDao extends DBConnection implements JournalDaoI {
	public boolean addJournal(Journal journal) {
		try {
			this.connect();
			em.getTransaction().begin(); // For DDL and DML, we have to use getTransaction.
			em.persist(journal);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Journal getJournalById(int id) {
		this.connect();
		Journal journal = em.find(Journal.class, id);
		this.disconnect();
		return journal;
	}
	
	public Journal updateJournal(Journal journal) {
		try {
			this.connect();
			em.getTransaction().begin();
			Journal journalFound = em.find(Journal.class, journal.getId());
			journalFound.setEntry(journal.getEntry());
			System.out.println("JOURNAL ENTRY UPDATED: " + journalFound);
			em.getTransaction().commit();
			this.disconnect();
			return journalFound;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
