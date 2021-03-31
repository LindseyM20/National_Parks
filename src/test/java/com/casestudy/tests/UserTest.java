package com.casestudy.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import com.casestudy.dao.UserDao;
import com.casestudy.models.User;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)		// Makes the tests run in alphabetcial order
@RunWith(Parameterized.class)  // Only need this if running parameterized tests
public class UserTest {
	
	static UserDao uDao;
	String userEmail;
	User userExpected;
	
	public UserTest(String userEmail, User userExpected) {
		this.userEmail = userEmail;
		this.userExpected = userExpected;
	}
	
	@Parameterized.Parameters
	public static Collection params() {
		return Arrays.asList(new Object[][] {
			// run this just for the addUser test...
			{"test@test.com", new User("Young", "test@test.com", "lkjhgfdsa")}
			// then check the database for the ID (auto_incremented)...
			// and plug the ID into this next line:
//			{"tekglobal@email.com", new User(10, "Young", "tekglobal@email.com", "lkjhgfdsa")}
//			{101, new Employee(101, "Young", "Professor", 95000)},
//			{103, new Employee(103, "Ben", "Developer", 70000)}
		});
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uDao = new UserDao();
		System.out.println("BeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("BeforeTest");
	}
	
	@Test
	public void test1AddUser() {
		System.out.println("Testing addUser method");
		boolean success = uDao.addUser(userExpected);
		assertTrue(success);
	}
	
	@Test
	public void test2FindUserByEmail() {
		System.out.println("Testing finding " + this.userExpected.getName());
		User userActual = uDao.findUserByEmail(this.userEmail);
		assertEquals(userExpected, userActual);
	}
	
	// probably not going to keep the following method
//	@Test
//	public void test3RemoveEmp() {
//		System.out.println("Testing removeEmp method");
//		boolean success = uDao.deleteUser(userExpected.getEmail());
//		assertTrue(success);
//	}

	// Everything after here is auto-generated
	
//	@Test
//	public void testUser() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUserIntStringStringString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUserStringStringString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetEmail() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetEmail() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPassword() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetPassword() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testObject() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetClass() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testHashCode() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEquals() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testClone() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testNotify() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testNotifyAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testWait() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testWaitLong() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testWaitLongInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFinalize() {
//		fail("Not yet implemented");
//	}

}