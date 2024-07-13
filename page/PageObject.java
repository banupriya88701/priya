package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {
	
	@FindBy(id="email")
	public static WebElement username;
	
	@FindBy(name="pass")
	public static WebElement password;
	
	@FindBy(name="login")
	public static WebElement login;
	
	

}

