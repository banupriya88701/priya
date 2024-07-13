package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolls {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.chrome.driver","C:\\Users\\91887\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gaqm.org/");
			
			Thread.sleep(2000);
			WebElement scroldown = driver.findElement(By.xpath("//h1[text()='Important Links']"));

			JavascriptExecutor ja=(JavascriptExecutor)driver;
			ja.executeScript("arguments[0].scrollIntoView(true)",scroldown);
			
			Thread.sleep(1000);
			WebElement scrolup = driver.findElement(By.xpath(""));
			ja.executeScript("argument[0].scrollIntoView(false)", scrolup);
			
			
			
			
	

	}

}
