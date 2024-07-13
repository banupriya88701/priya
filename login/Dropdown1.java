package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("Webdriver.chrome.driver", "\"C:\\\\Users\\\\91887\\\\eclipse-workspace\\\\Selenium\\\\liabray\\\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		
		//Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("(//select[@class='spTextField'])[1]"));
		
		
		Thread.sleep(2000);
		Select s=new Select(select);
		boolean b=s.isMultiple();
		System.out.println(b);
		
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByVisibleText("Manual Testing");
		Thread.sleep(2000);
		s.selectByValue("msagile");
		s.selectByIndex(3);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement web : allSelectedOptions) {
			System.out.println(web.getText());
			
		}
	

		
			
		
		
		
		
		
		
	}

}
