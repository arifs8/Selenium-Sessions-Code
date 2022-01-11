package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
//	Annotations:              before method -- test---after method ---6
//	@Before suite----1
//	@Before Test ---2
//	@Before class ---3
//	@Before method  ---4
//	@Test ---5
//	@Test
//	@After method ---9
//	@After class  ---10
//	@After test---11
//	@After Suite----12
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("connect with database");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("create user");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("creatlaunch browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("login to application");
	}
	
	@Test
	public void verifyTitleTest() {
		System.out.println("verify title");
	}
	
	@Test
	public void verifyLoggedInUser() {
		System.out.println("verify logged in user");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout to application");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("delete user");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("disconnect with database");
	}
}
