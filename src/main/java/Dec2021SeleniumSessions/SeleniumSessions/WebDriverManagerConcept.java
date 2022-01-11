package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); //compactable,versions,download
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
		WebDriver driver1 = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		WebDriverManager.getInstance(SafariDriver.class).setup();
		WebDriver driver2 = new SafariDriver();
	}

}
