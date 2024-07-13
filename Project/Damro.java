package Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Damro {
	public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("Webdrivr.chrome.driver", "C:\\\\Users\\\\91887\\\\eclipse-workspace\\\\Selenium\\\\liabray\\\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.damroindia.com/");
		
		//singup
		driver.findElement(By.xpath("(//span[text()='Sign in/Sign up'])[1]")).click();
		
				
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("user_name"));
		name.sendKeys("7010945080");
		
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Muguswe@7");
		
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
        search.sendKeys("chair" ,Keys.ENTER);
        
        Thread.sleep(7000);
        WebElement model = driver.findElement(By.xpath("//h6[text()='Pico High Back Chair - Blue']"));
        model.click();
		
        Thread.sleep(3000);
        WebElement addToCard = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addToCard.click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Dining Sets']")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h6[text()='Vision 4 Seater Dining Table set']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
      
        

		Thread.sleep(2000);
		WebElement scroldown = driver.findElement(By.xpath("//h5[text()='We Accept']"));

		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("arguments[0].scrollIntoView(true)",scroldown);
		
		Thread.sleep(1000);
		WebElement scrolup = driver.findElement(By.xpath("//button[text()='Modular Furniture']"));
		ja.executeScript("arguments[0].scrollIntoView(false)", scrolup);
		
        /*Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[text()='Living']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//h6[text()='Raffle Audio and Video Rack']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();*/
		
		
		Thread.sleep(4000);
		WebElement study= driver.findElement(By.xpath("//button[text()='Study and Office Furniture']"));
		Actions acc=new Actions (driver);
		acc.moveToElement(study).perform();
		acc.doubleClick(study).perform();
		acc.contextClick().perform();
		

        Thread.sleep(1000);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\brower.png");
        FileHandler.copy(src, des);
		
		
		
        
		
		
		
		
		
		
      
	}


	}
	
	

