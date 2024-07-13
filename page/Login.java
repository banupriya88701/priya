package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static void main(String[] args) {
		
       System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		PageFactory.initElements(driver, PageObject.class);
		PageObject.username.sendKeys("Java@gmail.com");
		PageObject.password.sendKeys("java3003");
		PageObject.login.click();
		
	
		
		
		
		
		
		
	}

}
