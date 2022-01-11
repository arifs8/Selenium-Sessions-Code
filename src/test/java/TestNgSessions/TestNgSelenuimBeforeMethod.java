package TestNgSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgSelenuimBeforeMethod {
WebDriver driver;
	
	@BeforeMethod
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
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
	}
	
	@Test(priority = 2)
	public void signupTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up")).isDisplayed());
	}
	
	@Test(priority = 3)
	public void loginTest() {
		 driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("test@123");
		 driver.findElement(By.className("btn btn-small")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
