package com.casestudy.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.casestudy.dao.ParkDao;
import com.casestudy.models.Park;

public class ParkTest {

	static ParkDao pDao;
	int parkId;
	String parkSummary = "Not just a great valley, but a shrine to human foresight, the strength of granite, the power of glaciers, the persistence of life, and the tranquility of the High Sierra. First protected in 1864, Yosemite National Park is best known for its waterfalls, but within its nearly 1,200 square miles, you can find deep valleys, grand meadows, ancient giant sequoias, a vast wilderness area, and much more.";
	Park parkExpected = new Park(61, "Yosemite National Park", "California", 1890, "/images/yosemite.jpg", 
			"https://blog.assets.thediscoverer.com/2019/03/Yosemite-National-Park-Valley.jpg", 
		    "Credit: f11photo/ Shutterstock", parkSummary);
	
	public ParkTest() {}


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pDao = new ParkDao();
		System.out.println("BeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("BeforeTest");
	}
	
	// Test for getParkById method: passes (Note: had to eliminate new lines in the summary in the database for Yosemite)
	@Test
	public void testGetParkById() {
		System.out.println("Testing finding " + this.parkExpected.getName());
		Park parkActual = pDao.getParkById(61);
		assertEquals(parkExpected, parkActual);
	}
}
