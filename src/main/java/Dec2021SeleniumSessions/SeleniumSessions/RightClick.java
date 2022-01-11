package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	
		WebElement element = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		
		//to get all the text
		//to get size
		//copy click

		List<WebElement> rightOptions = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));
		System.out.println(rightOptions.size());
		
		for(int i=0;i<rightOptions.size();i++) {
			String text = rightOptions.get(i).getText();
			//System.out.println(text);
			if(text.equals("Copy")) {
				rightOptions.get(i).click();
				break;
			}
			
		}
		
		
		
		

	}

}
