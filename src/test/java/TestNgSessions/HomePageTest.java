package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	@Test()
	public void loginTest() {
		 driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("test@123");
		 driver.findElement(By.className("btn-small")).click();
	}
}
