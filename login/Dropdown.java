package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "\"C:\\\\Users\\\\91887\\\\eclipse-workspace\\\\Selenium\\\\liabray\\\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement creatnewacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatnewacc.click();
		
		Thread.sleep(2000);
		WebElement dropmon = driver.findElement(By.id("month"));
		dropmon.click();
		
		Select s = new Select(dropmon);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("5");
		Thread.sleep(2000);
		s.selectByVisibleText("Mar");
		
		
		
		
		
		
		
		
		
		
	}

}
