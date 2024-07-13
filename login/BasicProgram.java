package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasicProgram {
	public static void main(String []args) {
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		//to launch the url
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.goibibo.com/?utm_source=bing&utm_medium=cpc&utm_campaign=IF-Brand-Ex_Ind&utm_adgroup=IF-Brand-Ex_Ind&utm_term=!SEM!IF!G!Brand-Ex_Ind!RSA!662302050!1329311850401391!!e!goibibo%20com!c!&msclkid=882a81b642bb1a533643e44f00f65bfb");
		driver.manage().window().maximize();
		
		/*WebElement urname=  driver.findElement(By.id("email"));
		urname.sendKeys("banupriya88701@gmail.com");
		
         WebElement paword= driver.findElement(By.id("pass"));
         paword.sendKeys("Banu@3003");*/

	}

}
