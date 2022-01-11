package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
		WebDriver driver = new FirefoxDriver();
		String username = "admin";
		String password = "admin";
		driver.get("https:///"+username+":"+password+"@"+"the-internet.herokuapp.com/basic-auth");
		
		
	}

}
