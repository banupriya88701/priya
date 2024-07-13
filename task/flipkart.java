package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\91887\\banu\\Selenium\\liabray");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//login 
		/*driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8870188541");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		Thread.sleep(2000);*/
		
		//Search
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		search.sendKeys("redmi",Keys.ENTER);
		Thread.sleep(2000);
		
		//select the amount
		driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]")).click();
		
		Robot r = new Robot();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//select the model
		Thread.sleep(3000);
		WebElement model = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]"));
		model.click();
		
		Thread.sleep(3000);
		
		//to get the parent window id in windows handling
		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);
		Thread.sleep(3000);
		
		// to get all window id
		Set<String> allwin= driver.getWindowHandles();
		System.out.println(allwin);
		Thread.sleep(3000);	
		
		//iterate
		for (String each : allwin) {
			if(!parentwin.equals(each)) {  
				driver.switchTo().window(each);
						
		}
					
		}
				
		//add to card
		Thread.sleep(2000);
		WebElement addtocard = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addtocard.click();
	
		Thread.sleep(2000);
		driver.switchTo().window(parentwin);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(5000);
		
		WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",remove);
		Thread.sleep(2000);
		
		WebElement removeitem = driver.findElement(By.xpath("(//div[text()='Remove'])[1]"));
		removeitem.click();
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}
	
}
