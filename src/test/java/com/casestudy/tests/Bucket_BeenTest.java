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
import com.casestudy.dao.ParkDao;
import com.casestudy.models.Bucket_Been;
import com.casestudy.models.Journal;
import com.casestudy.models.Park;
import com.casestudy.models.User;
import com.casestudy.service.ParkService;
import com.casestudy.service.UserService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)		// Makes the tests run in alphabetcial order
@RunWith(Parameterized.class)
public class Bucket_BeenTest {
	UserService uService = new UserService();
	ParkService pService = new ParkService();
	
	static Bucket_BeenDao bbDao;
	Bucket_Been bbExpected;
	int park_id;
	int user_id;
	Journal journal;
	
	User user = uService.findUserByEmailService("hello@world.com");
	Park park = pService .getParkByIdService(62);
	
	public Bucket_BeenTest(Bucket_Been bbExpected, int park_id, int user_id, Journal journal) {
		super();
		this.bbExpected = bbExpected;
		this.park_id = park_id;
		this.user_id = user_id;
		this.journal = journal;
	}
	
//	@Parameterized.Parameters
//	public static Collection params() {
//		return Arrays.asList(new Object[][] {
//			// run this just for the addUser test...
//			{"test@test.com", new Bucket_Been(park, user, false, null)}
//			// then check the database for the ID (auto_incremented)...
//			// and plug the ID into this next line:
////			{"tekglobal@email.com", new User(10, "Young", "tekglobal@email.com", "lkjhgfdsa")}
//
//		});
//	}
	
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
		boolean success = bbDao.addBBPark(bbExpected);
		assertTrue(success);
	}
	
	
	
	
//	Test2GetBBPark
//	Test3UpdateBBParkVisited
//	test4UpdateBBParkJournal
//	test5DeleteBBPark
}
