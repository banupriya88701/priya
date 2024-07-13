package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragsdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91887\\\\eclipse-workspace\\\\Selenium\\\\liabray\\\\selenium-server-4.17.0.jar ");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
	WebElement drag = driver.findElement(By.xpath("//img[@src=\"images/high_tatras2_min.jpg\"]"));
	WebElement drop = driver.findElement(By.id("//div[@id=\"trash\"]"));
	
	Actions acc=new Actions(driver);
	acc.dragAndDrop(drag, drop).perform();
	

	}

}
