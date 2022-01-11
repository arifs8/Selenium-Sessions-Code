package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertJsPopup {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freshworks.com/");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");
		

	}

}
