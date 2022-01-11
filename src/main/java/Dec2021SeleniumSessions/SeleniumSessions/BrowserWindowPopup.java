package Dec2021SeleniumSessions.SeleniumSessions;

import java.net.MulticastSocket;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://crmpro.com/index.html");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window id : " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("Child window id : " + childWindowId);
		Thread.sleep(3000);
		driver.switchTo().window(childWindowId);
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
