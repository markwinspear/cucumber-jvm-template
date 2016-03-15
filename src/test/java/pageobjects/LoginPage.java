package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver){
		super(driver);
	}    

	public static By email = By.id("email");
	public static By password = By.id("passwd");
	public static By email_create = By.id("email_create");
	public static By submit_create = By.id("submit_create");
	public static By signin_button = By.id("SubmitLogin");
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
