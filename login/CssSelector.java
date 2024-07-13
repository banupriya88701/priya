package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.chrome.driver","C:\\Users\\91887\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			//id(user name)
			driver.findElement(By.cssSelector("input#email")).sendKeys("Java@gmail.com");
			
			//or
			//driver.findElement(By.cssSelector("#email")).sendKeys("Java@gmail.com");
			
			//class
			//driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
			   //or
			//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("java");
			//attribute 
			driver.findElement(By.cssSelector("input[type=password]")).sendKeys("java");
			
			driver.findElement(By.cssSelector("button[name=login")).click();
			
			
	
	
	
	
	}	

}
