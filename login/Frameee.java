package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frameee {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.Chrome.driver","C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Accepted Elements")).click();
		
		driver.switchTo().frame(1);
	
		
		Thread.sleep(3000);
	    WebElement drag = driver.findElement(By.id("draggable"));
	    Thread.sleep(3000);
	    WebElement drop = driver.findElement(By.id("droppable"));
	
	    Actions a= new Actions(driver);
	    a.dragAndDrop(drag, drop).perform();
	
	    driver.switchTo().defaultContent();

	}

}
