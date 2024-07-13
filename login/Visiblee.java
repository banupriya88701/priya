package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visiblee {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("Webdriver.chrome.driver","C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement username = driver.findElement(By.id("email"));
			
			boolean b = username.isDisplayed();
			System.out.println(b);
			
			boolean c = username.isEnabled();
			System.out.println(c);
			
			if(b==c) {
				username.sendKeys("JAVA");
			}
			
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys("java");
			
			
            WebElement cr = driver.findElement(By.xpath("//a[@rel='async']"));cr.click();
            Thread.sleep(3000);
            
            WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
            
			boolean d = male.isSelected();
			Thread.sleep(2000);
			System.out.println(d);
			Thread.sleep(2000);
			
		    male.click();
			boolean e = male.isSelected();
			System.out.println(e);
			
			
			
		   
			
			
			
	}

}
