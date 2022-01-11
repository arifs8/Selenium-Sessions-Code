package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitWithTitle {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://crmpro.com/index.html");
		
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.name("username")).sendKeys("test@gamil.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
	}

}
