package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopupWithList {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://crmpro.com/index.html");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);
		
		System.out.println(handlesList.size());
		
		String parentWindowId = handlesList.get(0);
		String childWindowId = handlesList.get(1);
		System.out.println(parentWindowId);
		System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		System.out.println("child window title is " + driver.getTitle());
		System.out.println("child window url is " + driver.getCurrentUrl());
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.className("btn-small"));
		
	    Actions action = new Actions(driver);
	    
	    action.sendKeys(username,"test@gmail.com").build().perform();
	    action.sendKeys(password,"test@123").build().perform();
	    action.click(loginBtn).build().perform();
	    
	    driver.quit();
		
		

	}

}
