package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Thread.sleep(10000); //static 
		//wait ---Implicit ,Explicit 
		//1.Implicit wait is global wait
		//it only waits for webelements
		//again and again wait
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://crmpro.com/index.html");
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("test@gamil.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//nullify implicity wait
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
