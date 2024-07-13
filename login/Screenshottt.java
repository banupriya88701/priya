package login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshottt {

	public static void main(String[] args) throws IOException {
System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//typecase
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\91887\\eclipse-workspace\\Selenium\\screenshot\\testing.png");
		FileHandler.copy(screenshotAs, des);
		
		
		

	}

}
