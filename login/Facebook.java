package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement login= driver.findElement(By.xpath("//h2[contains(@class,'_8eso')]"));
		String text = login.getText();
		System.out.println(text);
		
		String attribute = login.getAttribute("class");
		System.out.println(attribute);
		
		
		
		
		
		

	}

}