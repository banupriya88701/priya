package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
	System.setProperty("Webdrive.rome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.olacabs.com/");
	
	WebElement element=driver.findElement(By.id("current-location"));
	element.sendKeys("Kovilambakkam");

		
		
	}

}