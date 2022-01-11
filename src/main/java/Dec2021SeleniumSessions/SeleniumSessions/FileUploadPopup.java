package Dec2021SeleniumSessions.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {
	public static void main(String[] args) {
	
	WebDriverManager.firefoxdriver().setup(); //compactable,versions,download
	WebDriver driver = new FirefoxDriver();
	driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
	driver.findElement(By.name("upfile")).sendKeys("D:\\Arif\\Reshma\\selenium.txt");

}
}