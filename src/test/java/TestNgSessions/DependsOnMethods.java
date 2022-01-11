package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test()
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods="loginTest",priority =2)
	public void homePageTest() {
		System.out.println("Home page");
	}
	
	@Test(dependsOnMethods="loginTest" ,priority =1)
	public void searchPageTest() {
		System.out.println("search page test");
	}
	

}
