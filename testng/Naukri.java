package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\91887\\banu\\Selenium\\liabray");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		
		//login
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("priya701@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2345678");
		Thread.sleep(2000);
		
		JavascriptExecutor ja=(JavascriptExecutor)driver;
        WebElement lgn =driver.findElement(By.xpath("//button[@type='submit']"));
        ja.executeScript("arguments[0].click()", lgn);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='view-profile-wrapper']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Update resume']")).click();
		Thread.sleep(2000);
		
		 StringSelection ss = new StringSelection("file:///C:/Users/91887/Desktop/Project/Damro%20pro%20pdf%20(1).pdf");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 Thread.sleep(2000);
		 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 
			
	     r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
			
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
}
}
