package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91887\\eclipse-workspace\\Selenium\\liabray\\selenium-server-4.17.0.jar");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        
        WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
        
        List<WebElement> allRows=table.findElements(By.tagName("tr"));
        
        for(int i=0; i<allRows.size();i++) {
        	WebElement row=allRows.get(i);
        	
        	
        	List<WebElement> allData=row.findElements(By.tagName("td"));
        	for(int j=0;j<allData.size();j++) {
        	WebElement data=allData.get(j);
        	System.out.println(data.getText()+"  ");
        }
        	System.out.println();
        }
        
		
	}

}
