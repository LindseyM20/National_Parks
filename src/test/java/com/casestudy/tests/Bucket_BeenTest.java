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

import com.casestudy.dao.Bucket_BeenDao;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Journal;
import com.casestudy.models.Park;
import com.casestudy.models.User;
import com.casestudy.service.ParkService;
import com.casestudy.service.UserService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)	// Makes the tests run in alphabetical order
@RunWith(Parameterized.class)
public class Bucket_BeenTest {
	static UserService uService = new UserService();
	static ParkService pService = new ParkService();
	static User user = uService.findUserByEmailService("test@test.com");
	static Park park = pService .getParkByIdService(62);
	static Journal journal = new Journal(50, "this is the test journal");
	static Bucket_BeenDao bbDao;
	
	
	int park_id;
	int user_id;
	Bucket_Been bbExpected;

	
	public Bucket_BeenTest(int park_id, int user_id, Bucket_Been bbExpected) {
		super();
		this.park_id = park_id;
		this.user_id = user_id;
		this.bbExpected = bbExpected;
	}
	
	@Parameterized.Parameters
	public static Collection params() {
		return Arrays.asList(new Object[][] {
			{62, 1, new Bucket_Been(park, user, false, null)},
			{58, 1, new Bucket_Been(park, user, true, journal)}
		});
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bbDao = new Bucket_BeenDao();
		System.out.println("BeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("BeforeTest");
	}
	
	// Test for addBBPark method: passes 
	@Test
	public void test1AddBBPark() {
		System.out.println("Testing addBBPark method");
		boolean success = bbDao.addBBPark(this.bbExpected);
		assertTrue(success);
	}
	
	// Test for getBBPark method: passes
	@Test
	public void test2GetBBPark() {
		System.out.println("Testing getBBPark method");
		Bucket_Been bbActual = bbDao.getBBPark(62, 1);
		assertEquals(bbExpected, bbActual);
	}
	
	// Test for updateBBParkVisited method: passes
	@Test
	public void test3UpdateBBParkVisited() {
		System.out.println("Testing updateBBParkVisited method");
		assertTrue(bbDao.updateBBParkVisited(62, 1));
	}
	
	// Test for updateBBParkVisited method: passes
	@Test
	public void test4UpdateBBParkJournal() {
		System.out.println("Testing updateBBParkJournal method");
		assertTrue(bbDao.updateBBParkJournal(62, 1, journal));
	}

	// Test for deleteBBPark method: passes
	@Test
	public void test5DeleteBBPark() {
		System.out.println("Testing deleteBBPark method");
		assertTrue(bbDao.deleteBBPark(bbExpected.getPrimaryKey().getPark_id(), bbExpected.getPrimaryKey().getUser_id()));
	}
}
