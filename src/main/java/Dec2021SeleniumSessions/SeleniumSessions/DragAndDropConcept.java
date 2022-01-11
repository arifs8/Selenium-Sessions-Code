package Dec2021SeleniumSessions.SeleniumSessions;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {
		// drag and drop,right click,mouser hover,sendkeys and click ,move to element ---- Actions class
		
		//Drag and drop - click and hold ,move ,release
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceele = driver.findElement(By.id("draggable"));
		WebElement targetele = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//action.clickAndHold(sourceele).moveToElement(targetele).release().build().perform();
		action.dragAndDrop(sourceele, targetele).build().perform();

	}

}
