package login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	
    //Alert with ok
	WebElement alt = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	alt.click();

	//button click
	WebElement click = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	click.click();
	
	Alert al=driver.switchTo().alert();
	Thread.sleep(2000);
	al.accept();
	
	//Alert with ok and cancel
	WebElement altok = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	altok.click();
	Alert alt1 = driver.switchTo().alert();
	Thread.sleep(3000);
	alt1.dismiss();
	
	//Alert with textbox
	WebElement text = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	text.click();
	Alert alt2 = driver.switchTo().alert();
	Thread.sleep(2000);
	alt2.sendKeys("java");
	
	
	
		

	}

}
