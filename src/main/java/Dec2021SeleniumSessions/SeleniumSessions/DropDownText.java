package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownText {

	public static void main(String[] args) {
	
		By dropdown = By.id("dropdown");
		
		WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		ElementsUtils elementUtil = new ElementsUtils(driver);
		elementUtil.doSelectByVisibleText(dropdown, "Option 1");
		
		

	}

}
