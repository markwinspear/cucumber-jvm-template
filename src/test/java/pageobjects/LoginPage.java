package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver){
		super(driver);
	}    

	
/*	@FindBy(how=How.ID, using="email")
	public static WebElement email;
	
	@FindBy(how=How.ID, using="passwd")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public static WebElement signin_button;
	

	@FindBy(how=How.ID, using="email_create")
	public static WebElement email_create;

	@FindBy(how=How.ID, using="SubmitCreate")
	public static WebElement submit_create;*/

	public static By email = By.id("email");
	public static By password = By.id("password");
	public static By email_create = By.id("email_create");
	public static By submit_create = By.id("submit_create");
	public static By signin_button = By.id("SubmitLogin");
	
		
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
