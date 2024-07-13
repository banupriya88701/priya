package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\91887\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\liabray\\\\\\\\selenium-server-4.17.0.jar ");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath(""));
		
		
		
		
		

	}

}
