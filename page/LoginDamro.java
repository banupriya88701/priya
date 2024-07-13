package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginDamro {
	
	public static void main(String[] args) {
		
	       System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.damroindia.com/");
			
			PageFactory.initElements(driver, PageDamro.class);
			PageDamro.name.sendKeys("7010945080");
			PageDamro.pass.sendKeys("Muguswe@7");
			PageDamro.login.click();
			PageDamro.search.sendKeys("\"chair\" ,Keys.ENTER");
			PageDamro.model.click();
			PageDamro.addToCard.click();
			
			
			
	}

}
