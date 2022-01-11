package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForTitle {
	
	//explicit - webdriverwait ----extends fluent wait

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://crmpro.com/index.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		System.out.println(driver.getTitle());

	}

}
