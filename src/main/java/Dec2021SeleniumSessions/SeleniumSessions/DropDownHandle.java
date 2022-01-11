package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		doSelectByVisibleText(dropdown, "Option 1");
		doSelectByIndex(dropdown, 1);
		doSelectByValue(dropdown, "2");
		//Select select = new Select(dropdown);
		//select.selectByVisibleText("Option 1"); //by visible text
		//select.selectByIndex(1);
		//select.selectByValue("2");//value attribute

	}
	
	public static void doSelectByVisibleText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static void doSelectByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

}
