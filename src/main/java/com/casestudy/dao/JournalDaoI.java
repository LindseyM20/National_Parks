package com.casestudy.dao;

import java.util.List;

import com.casestudy.models.Journal;
import com.casestudy.models.Park;

public interface JournalDaoI {
	public boolean addJournal(Journal journal);
	public Journal getJournalById(int id);
	public Journal updateJournal(Journal journal);
}
