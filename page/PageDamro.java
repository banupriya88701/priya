package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDamro {

	@FindBy(id="user_name")
	public static WebElement name;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement login;
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement search;
	
	@FindBy(xpath="//h6[text()='Pico High Back Chair - Blue']")
	public static WebElement model;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	public static WebElement addToCard;
	
	
	
	
	
	
	
	
	
}
