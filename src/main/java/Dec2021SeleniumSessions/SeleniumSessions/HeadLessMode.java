package Dec2021SeleniumSessions.SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessMode {

	public static void main(String[] args) {
		
		//chrome 
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		co.addArguments("--incognito");
//		WebDriver driver = new ChromeDriver(co);
		
		//firefox
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(fo);
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
