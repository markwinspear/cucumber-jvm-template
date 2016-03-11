package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static step_definitions.Hooks.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}

	public static By sign_in = By.linkText("Sign in");
	public static By contact_us = By.linkText("Contact us");
	public static By sign_out = By.linkText("Sign out");

/*	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement sign_in;
	
	@FindBy(how=How.LINK_TEXT, using="Contact us")
	public static WebElement contact_us;
	
	@FindBy(how=How.LINK_TEXT, using="Sign out")
	public static WebElement sign_out;*/
		
	public static class HeaderPage 
	{
/*		@FindBy(how=How.LINK_TEXT, using="Women")
		public static WebElement menu_women;
		
		@FindBy(how=How.XPATH, using="/*//*a[@title='Dresses']")
		public static WebElement menu_dresses;
		
		@FindBy(how=How.XPATH, using="/*//*a[@title='T-shirts']")
		public static WebElement menu_tshirts;
		*/
		public static By menu_women = By.linkText("Women");
		public static By menu_dresses = By.xpath("//*a[@title='Dresses']");
		public static By menu_tshirts = By.xpath("//*a[@title='T-shirts']");

		public static class DressesPage
		{
				
/*			@FindBy(how=How.XPATH, using="/*//*a[@title='Summer Dresses']")
			public static WebElement summer_dresses;
			*/
			public static By summer_dresses = By.xpath("//*a[@title='Summer Dresses']");
			
		}
		
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	