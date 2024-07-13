package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	WebDriver driver;
	long startTime;
	
	@BeforeSuite
	
	public void launchBrower() {
		long startTime=System.currentTimeMillis();
       System.setProperty("WebDriver.edge.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
	}
	@Test
	public void openFacebook() {
		driver.get("https://www.facebook.com/login.php");
	}
	@Test
	public void openflipcard() {
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void openAmozon() {
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_5twasf2d2w_e&adgrpid=1318316051640309&hvadid=82395019828275&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=150098&hvtargid=kwd-82395637438085:loc-90&hydadcr=5652_2377259");
	}
	@AfterSuite
	public void closeBrower() {
		driver.quit();
		long endtime=System.currentTimeMillis();
		long totaltime=startTime-endtime;
		System.out.println(totaltime);
		
	}
	
	
	
	/*@Test
	public void openFacebook() {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		}
	@Test
	public void openflipcard() {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void openAmozon() {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_5twasf2d2w_e&adgrpid=1318316051640309&hvadid=82395019828275&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=150098&hvtargid=kwd-82395637438085:loc-90&hydadcr=5652_2377259");
	}*/
	
	
	
	
	

}
