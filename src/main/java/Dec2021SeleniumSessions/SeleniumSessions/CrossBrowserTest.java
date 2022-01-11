package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		
		String browser = "firefox";
		//FirefoxDriver driver = new FirefoxDriver();
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\UIE13841\\Documents\\SeleniumSessions\\chromedriver.exe");
			  driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\UIE13841\\Documents\\SeleniumSessions\\geckodriver.exe");
		   driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
		   driver = new SafariDriver();
		}
	
	}

}
