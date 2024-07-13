package login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_5twasf2d2w_e&adgrpid=1318316051640309&hvadid=82395019828275&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=150098&hvtargid=kwd-82395637438085:loc-90&hydadcr=5652_2377259");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Samsung mobile 5G",Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement model = driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy')]"));
		model.click();
		
		//to get the parent window id
		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);//000
		
		// to get all window id
		Set<String> allwin= driver.getWindowHandles();
		System.out.println(allwin);//111
		
		//iterate
		for (String each : allwin) {
			if(!parentwin.equals(each)) {  //(!000==111/000)
				driver.switchTo().window(each);
				
			}
			
		}
		
	    Thread.sleep(2000);
	    WebElement addToCard = driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0],click()", addToCard);
		
		
		
		
		
		
		
		
		
		

	}

}
