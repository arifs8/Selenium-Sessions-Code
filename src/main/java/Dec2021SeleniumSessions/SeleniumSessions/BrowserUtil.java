package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver init_driver(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup(); // compactable,versions,download
		   driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
			driver = new FirefoxDriver();
			break;
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
			break;

		default:
			System.out.println(browserName + " not found");
			break;
		}
		return driver;
	}
	
	public void launchUrl (String url) {
		driver.get(url);
		
	}
	
	public String doGetTitle() {
		return driver.getTitle();
	}
	
	public void doQuitBrowser() {
		driver.quit();
	}
	
	public void navigateToUrl(String url) {
		driver.navigate().to(url);
	}
	
	

}
