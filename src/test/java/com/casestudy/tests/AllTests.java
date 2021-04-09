package com.casestudy.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// This is a test suite that will run all the other tests in this package.
// For this to work, make sure the DB has all the parks, but drop the bucket_been, user, and journal tables.
// For some reason, Bucket_BeenTest fails here but passes if you run it from its own class after running this.
@RunWith(Suite.class)
@SuiteClasses({ 
	ParkTest.class,
	UserTest.class,
	JournalTest.class,
	Bucket_BeenTest.class, 
})

public class AllTests {

}
