package TestNgSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url ,String browser) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
			break;
	   case "firefox":
		WebDriverManager.firefoxdriver().setup(); 
		driver = new FirefoxDriver();
		break;
	 	default:
	 		System.out.println("Enter correct browser "+browser);
	    break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.manage().window().fullscreen();
		driver.get(url);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
