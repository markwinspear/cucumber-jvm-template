package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ContactusPage extends BaseClass{
	
	public ContactusPage(WebDriver driver)
	{
		super(driver);
	}


/*	@FindBy(how=How.CSS, using=".selector,.hover")
	public static WebElement div_heading;

	@FindBy(how=How.ID, using="id_contact")
	public static Select subject_heading;

	@FindBy(how=How.ID, using="email")
	public static WebElement email;

	@FindBy(how=How.ID, using="id_order")
	public static WebElement order_reference;

	@FindBy(how=How.ID, using="message")
	public static WebElement message;

	@FindBy(how=How.ID, using="submitMessage")
	public static WebElement submit;

	@FindBy(how=How.CLASS_NAME, using="alert-danger")
	public static WebElement error_message;
	*/

	By div_heading = By.cssSelector(".selector,.hover");
	By subject_heading = By.id("id_contact");
	By email = By.id("email");
	By order_reference = By.id("order_reference");
	By message = By.id("message");
	By submit = By.id("submit");
	By error_message = By.className("alert-danger");
	
}
