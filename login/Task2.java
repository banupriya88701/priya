package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'PREMIUM BOUTIQUES')]"));
		String text = login.getText();
	    System.out.println(text);
	     
	   String attribute = login.getAttribute("baby");
	   System.out.println(attribute);
	     
	     
		
		
		

	}

}

