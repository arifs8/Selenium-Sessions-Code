package TestNgSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngSelenium {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.firefoxdriver().setup(); 
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.manage().window().fullscreen();
		driver.get("http://crmpro.com/index.html");
	}
	
	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("title is : " + title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.","login title is worng ");
		
	}
	
	@Test(priority = 2)
	public void signupTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up")).isDisplayed());
	}
	
	@Test(priority = 3)
	public void loginTest() {
		 driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("test@123");
		 driver.findElement(By.className("btn-small")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
