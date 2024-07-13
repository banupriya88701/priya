package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartt {
	
	public static void main(String[]args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));
		element.click();
		
		WebElement element1= driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		element1.sendKeys("banupriya88701@gmail.com");
		

		WebElement element2= driver.findElement(By.xpath("//button[text()='Request OTP']"));
		element2.click();
		
	    WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Get access')]"));
	    String text = element3.getText();
	    System.out.println(text);
		
		
		
	}

}
