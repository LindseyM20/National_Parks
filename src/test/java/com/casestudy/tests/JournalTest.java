package com.casestudy.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import com.casestudy.dao.JournalDao;
import com.casestudy.models.Journal;
import com.casestudy.models.User;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class JournalTest {
	static JournalDao jDao;
	
	int journal_id;
	Journal journalExpected;

	public JournalTest(int journal_id, Journal journalExpected) {
		this.journal_id = journal_id;
		this.journalExpected = journalExpected;
	}
	
	@Parameterized.Parameters
	public static Collection params() {
		return Arrays.asList(new Object[][] {
			{1, new Journal(1, "This is a test journal")},
			{2, new Journal(2, "This is a second test journal")}
		});
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		jDao = new JournalDao();
		System.out.println("BeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("BeforeTest");
	}
	
	// Test for addJournal method: passes
	@Test
	public void test1AddJournal() {
		System.out.println("Testing addJournal method");
		assertTrue(jDao.addJournal(this.journalExpected));
	}
	
	// Test for addJournal method: passes
	@Test
	public void test2GetJournalById() {
		System.out.println("Testing getJournalById method");
		Journal jActual = jDao.getJournalById(this.journal_id);
		assertEquals(journalExpected, jActual);
	}
	
	// Test for updateJournal method: passes
	@Test
	public void test3UpdateJournal() {
		System.out.println("Testing updateJournal method");
		assertTrue(jDao.updateJournal(this.journalExpected));
	}
	
	// Test for deleteJournal method: passes
	@Test
	public void test4DeleteJournal() {
		System.out.println("Testing deleteJournal method");
		assertTrue(jDao.deleteJournal(this.journal_id));
	}

}
