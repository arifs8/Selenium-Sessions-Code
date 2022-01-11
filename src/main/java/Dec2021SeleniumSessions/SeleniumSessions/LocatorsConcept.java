package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UIE13841\\Documents\\SeleniumSessions\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		//driver.get("https://classic.crmpro.com/");
		driver.get("https://www.freshworks.com/");
		//Thread.sleep(5000);
		
		//1.name locator - 2nd preference if unique
		//1.Approach 
		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//2.approach
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
		
		//3.using by class 3rd preference if unique
		By email = By.name("username");
		By password1 = By.name("password");
		driver.findElement(email).sendKeys("test@gmail.com");
		driver.findElement(password1).sendKeys("test@123");
		
		//4.using string class
		
		String emailid = "username";
		String password2 = "password";
		
		By emailid1 = By.name(emailid);
		By password3 = By.name(password2);
		
		driver.findElement(emailid1).sendKeys("test@gmail.com");
		driver.findElement(password3).sendKeys("test@123");
		
		//2.id locator  -- 1st preference
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		//3.classname
		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		//4.xpath  ----4th preference
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("test@gmail.com");
		
		//5.css selector ----4th preference
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("test@gmail.com");
		
		//6.link text - only for links
		driver.findElement(By.linkText("Sign up")).click();
		
		//7.Partial Link text - partially passing text
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8.tag name 
		System.out.println(driver.findElement(By.tagName("h1")).getText());
			

	}
}
