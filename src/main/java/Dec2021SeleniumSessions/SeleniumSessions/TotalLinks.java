package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
	
		//1.get count of links in page
		//2.print text of each link
		//3.print the href prop of each link
		
		WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> linkslist= driver.findElements(By.tagName("a"));
		System.out.println("Total links : " + linkslist.size());
		
		for(int i=0;i<linkslist.size();i++) {
			String text = linkslist.get(i).getText();
			//System.out.println(text);
			if(!text.isEmpty()) {
				System.out.println(i + "---" +text.trim());
				System.out.println(linkslist.get(i).getAttribute("href"));
			}
		}

	}

}
