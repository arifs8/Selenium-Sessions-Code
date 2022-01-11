package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UIE13841\\Documents\\SeleniumSessions\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //top casting
		
		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		String title1 = driver.getTitle();
		System.out.println(title1);

	}

}
