package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UIE13841\\Documents\\SeleniumSessions\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //top casting
		//FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
//       String pageSource=driver.getPageSource();
//       System.out.println(pageSource);
		
		if(title.equals("Google"))
		{
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		

		driver.close();
		driver.quit();
	}

}
