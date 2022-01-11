package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitWedElements {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://crmpro.com/index.html");
		waitForElementPresent(driver, 10, By.name("username"));
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("test@gamil.com");
		driver.findElement(By.name("password")).sendKeys("test@123");

	}

	public static WebElement waitForElementPresent(WebDriver driver,int timeout,By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}
}
