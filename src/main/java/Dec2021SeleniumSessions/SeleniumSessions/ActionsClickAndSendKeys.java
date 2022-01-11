package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://crmpro.com/index.html");
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.className("btn-small"));
		
	    Actions action = new Actions(driver);
	    
	    action.sendKeys(username,"test@gmail.com").build().perform();
	    action.sendKeys(password,"test@123").build().perform();
	    action.click(loginBtn).build().perform();
	    

	}

}
