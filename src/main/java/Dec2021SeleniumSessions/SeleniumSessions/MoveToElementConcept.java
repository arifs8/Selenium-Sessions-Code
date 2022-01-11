package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Thread.sleep(4000);
		
		WebElement element = driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();

	}

}
