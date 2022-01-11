package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("firefox");
		br.launchUrl("https://www.crmpro.com");
		Thread.sleep(5000);
//		System.out.println(br.doGetTitle());
//		
//		By emailId = By.name("username");
//		By password = By.name("password");
//		By loginBtn = By.className("btn-small");
//		
//		ElementsUtils elementutil = new ElementsUtils(driver);
//		elementutil.doSendKeys(emailId, "test@gmail.com");
//		elementutil.doSendKeys(password, "test@123");
//		
//		if(elementutil.doIsDisplayed(loginBtn)) {
//			System.out.println("element is present");
//			elementutil.doClick(loginBtn);
//		}

		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(3000);
		String parentWin = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			String childWin = it.next();

			if (!parentWin.equals(childWin)) {

				driver.switchTo().window(childWin);
				driver.findElement(By.id("email")).sendKeys("test@gmaul.com");

				// br.doQuitBrowser();

			}
		}
	}
}
