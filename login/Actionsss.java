package login;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		
		WebElement course = driver.findElement(By.xpath("//a[text()=\"Online Courses\"]"));
		Actions acc=new Actions (driver);
		acc.moveToElement(course).perform();
		acc.doubleClick(course).perform();
		acc.contextClick(course);
		

	}

}
