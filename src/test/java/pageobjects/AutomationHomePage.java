package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static step_definitions.Hooks.*;
public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}

	public static By sign_in = By.linkText("Sign in");
	public static By contact_us = By.linkText("Contact us");
	public static By sign_out = By.linkText("Sign out");

	public static class HeaderPage 
	{
		public static By menu_women = By.linkText("Women");
		public static By menu_dresses = By.xpath("//*a[@title='Dresses']");
		public static By menu_tshirts = By.xpath("//*a[@title='T-shirts']");

		public static class DressesPage
		{
			public static By summer_dresses = By.xpath("//*a[@title='Summer Dresses']");
			
		}
		
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	