package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		//typecast
		
	JavascriptExecutor ja=(JavascriptExecutor)driver;
	ja.executeScript("arguments[0].setAttribute('value','java@gmail.com')", username);
	
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		ja.executeScript("arguments[0].setAttribute('value','javaaa')", pass);
		
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		ja.executeScript("arguments[0].click()", login);
		
		
		
		
		
		
		
		

	}

}
