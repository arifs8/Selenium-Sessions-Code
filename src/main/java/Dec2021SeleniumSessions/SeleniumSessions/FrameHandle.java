package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame("main");//name or id 
		//driver.switchTo().frame(2);	//index
		driver.switchTo().frame(driver.findElement(By.name("main"))); //webelement
		String title = driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);
		driver.switchTo().defaultContent();

	}

}
