package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationss {

	public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.linkedin.com/login");
		driver.navigate().to("https://www2.hm.com/en_in/baby/products/clothing.html?utm_id=bi_cmp-614061308_adg-1136896725980304_ad-71056199015357_kwd-71056738492040:loc-150098_dev-c_ext-_prd-_sig-35a8ca9b5d701986aebeaf6d17793db7&msclkid=35a8ca9b5d701986aebeaf6d17793db7");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

}
