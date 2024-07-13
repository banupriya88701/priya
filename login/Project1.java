package login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Project1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("mugeshmugu");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("mugesh@77");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		Thread.sleep(1000);
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location.sendKeys("Brisbane");
		
		Thread.sleep(1000);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		hotel.sendKeys("Hotel Hervey");
		
		Thread.sleep(1000);
		WebElement hotelType = driver.findElement(By.xpath("//select[@name='room_type']"));
		hotelType.sendKeys("Deluxe");
		
		Thread.sleep(1000);
		WebElement noOfType = driver.findElement(By.id("room_nos"));
		noOfType.sendKeys("3");
		
		Thread.sleep(1000);
		WebElement checkIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkIn.sendKeys("14/3/24");
		
		Thread.sleep(1000);
		WebElement checOut = driver.findElement(By.id("datepick_out"));
		checOut.sendKeys("17/3/24");
		
		Thread.sleep(1000);
		WebElement adultPer= driver.findElement(By.xpath("//select[@name='adult_room']"));
		adultPer.sendKeys("3");
		
		Thread.sleep(1000);
		WebElement childPer = driver.findElement(By.xpath("//select[@name='child_room']"));
		childPer.sendKeys("1");
		
		Thread.sleep(1000);
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("radiobutton_0")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Banu");
		
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("Priya");
		
		Thread.sleep(1000);
		WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
		add.sendKeys("4/90,Kovilambakkam,chennai");
		
		Thread.sleep(1000);
		WebElement creditNo = driver.findElement(By.xpath("//input[@name='cc_num']"));
		creditNo.sendKeys("4512394571624859");
		
		Thread.sleep(1000);
		WebElement cardType = driver.findElement(By.id("cc_type"));
	    cardType.sendKeys("VISA");
	    
	    Thread.sleep(1000);
	    WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	    month.sendKeys("February");
	    
	    Thread.sleep(1000);
	    WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	    year.sendKeys("2015");
	    
	    Thread.sleep(1000);
	    WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
	    cvvNo.sendKeys("589441222111");
	    
	    Thread.sleep(1000);
	    driver.findElement(By.id("book_now")).click();
	    
	    Thread.sleep(8000);
	   //order number
	    WebElement orderNo = driver.findElement(By.id("order_no"));
	    String a = orderNo.getAttribute("value");
	   
	    System.out.println("order no : "+a);
	    
	    Thread.sleep(2000);
	    
	    //typecase
	    TakesScreenshot tk=(TakesScreenshot)driver;
	  	File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
	  	File des = new File("C:\\Users\\91887\\eclipse-workspace\\Selenium\\screenshot\\testing.png");
	  	FileHandler.copy(screenshotAs, des);
	    
	   //scrolup and scroldown
		Thread.sleep(1000);
		
		Thread.sleep(1000);
	  	WebElement scroldown = driver.findElement(By.xpath("(//h4[@style='margin:0px;'])[5]"));
	  	JavascriptExecutor ja=(JavascriptExecutor)driver;
	  	ja.executeScript("arguments[0].scrollIntoView(true)", scroldown);
		
	  	Thread.sleep(1000);
	  	WebElement scrolup = driver.findElement(By.xpath("(//h4[@style='margin:0px;'])[1]"));
	  	ja.executeScript("arguments[0].scrollIntoView(false)",scrolup);
		
		
		
		
		
		
		
		
	    
	    
	    
	
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
