package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	
	@Test()
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("title is : " + title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
	}
	
	@Test()
	public void signupTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up")).isDisplayed());
	}

}
