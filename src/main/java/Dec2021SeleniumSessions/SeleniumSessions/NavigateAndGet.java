package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateAndGet {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UIE13841\\Documents\\SeleniumSessions\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		driver.navigate().to("http://www.rediff.com");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().forward();
		
		//get and navigate 
		//1.get method will open url ---this will wait till page load completed
		//navigate also will navigate to url---this will not wait till page load completed
		
		//2.get method will not maintain history
		//navigate method will maintain history
		

	}

}
