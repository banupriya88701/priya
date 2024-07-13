package testng;

import org.testng.annotations.Test;

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
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class DamroProj {
	   public class TestngDamdro{
	    	
	    ChromeDriver driver;
	    
		
		@BeforeSuite
	   public void launcher() { 
		
		   
		System.setProperty("Webdrivr.chrome.driver", "C:\\\\Users\\\\91887\\\\eclipse-workspace\\\\Selenium\\\\liabray\\\\selenium-server-4.17.0.jar");
		ChromeOptions options=new ChromeOptions();
	//	options.addArguments("--headless=new");
	
		driver = new ChromeDriver(options);
	    }
	   
		@Test(priority=1)
		public void sitelaunch() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://www.damroindia.com/");
		
		
		Thread.sleep(2000);
		
		}
		
		@Test(priority=2)
		public void screen1() throws InterruptedException, IOException {
			Thread.sleep(2000);
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\1.brower.png");
	        FileHandler.copy(src, des);
		}
	
		
	   
		
		
		@Test(priority=3)
		public void loginAccount() throws InterruptedException {
			
		driver.findElement(By.xpath("(//span[text()='Sign in/Sign up'])[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.id("user_name"));
		name.sendKeys("7010945080");
		
		
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Muguswe@7");
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
		}
		
		@Test(priority=4)
		public void screen2() throws InterruptedException, IOException {
			Thread.sleep(2000);
			File src2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des2=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\2.login.png");
	        FileHandler.copy(src2, des2);
		}
	
		
		@Test(priority=5)
		public void firstmodels() throws InterruptedException {
		
        Thread.sleep(2000);
        
        WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
        search.sendKeys("chair" ,Keys.ENTER);
        
        Thread.sleep(7000);
        
        WebElement model = driver.findElement(By.xpath("//h6[text()='Pico High Back Chair - Blue']"));
        model.click();
		
        Thread.sleep(3000);
        
        WebElement addToCard = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addToCard.click();        
		}
		
		@Test(priority=6)
		public void screen3() throws InterruptedException, IOException {
			Thread.sleep(2000);
			File src3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des3=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\3.firstmodels.png");
	        FileHandler.copy(src3, des3);
		}
	
		
		@Test(priority=7)
		public void secondModels() throws InterruptedException {
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[text()='Dining Sets']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//h6[text()='Vision 4 Seater Dining Table set']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        
		}
		
		@Test(priority=8)
		public void screen4() throws InterruptedException, IOException {
			Thread.sleep(2000);
			File src4= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des4=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\4.secondModels.png");
	        FileHandler.copy(src4, des4);
		}
	
		

        
		@Test(priority=9)
		public void scrolls() throws InterruptedException {

			Thread.sleep(2000);
			WebElement scroldown = driver.findElement(By.xpath("//h5[text()='We Accept']"));

			JavascriptExecutor ja=(JavascriptExecutor)driver;
			ja.executeScript("arguments[0].scrollIntoView(true)",scroldown);
			
			Thread.sleep(1000);
			WebElement scrolup = driver.findElement(By.xpath("//button[text()='Modular Furniture']"));
			ja.executeScript("arguments[0].scrollIntoView(false)", scrolup);
		}
		
		@Test(priority=10)
		public void screen5() throws InterruptedException, IOException {
			Thread.sleep(2000);
			File src5= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des5=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\5.scrolls.png");
	        FileHandler.copy(src5, des5);
		}
	
		
		@Test(priority=11)
		public void thirdModels() throws InterruptedException {

        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[text()='Living']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//h6[text()='Raffle Audio and Video Rack']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		
		@Test(priority=12)
		public void screen6() throws InterruptedException, IOException {
			Thread.sleep(2000);
			File src6= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des6=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\6.thirdModels.png");
	        FileHandler.copy(src6, des6);
		}
	
		
		@Test(priority=13)
		public void actionss() throws InterruptedException {
			
		Thread.sleep(4000);
		
		WebElement study= driver.findElement(By.xpath("//button[text()='Study and Office Furniture']"));
		
		Actions acc=new Actions (driver);
		
		acc.moveToElement(study).perform();
		acc.doubleClick(study).perform();
		acc.contextClick().perform();
		
		}
		
		@Test(priority=14)
		public void screen7() throws InterruptedException, IOException {
			Thread.sleep(5000);
			File src7= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des7=new File("C:\\Users\\91887\\banu\\Selenium\\screenshot\\7.actions.png");
	        FileHandler.copy(src7, des7);
		}
	
	}
	
}


