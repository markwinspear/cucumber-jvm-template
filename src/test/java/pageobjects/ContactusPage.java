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

	By div_heading = By.cssSelector(".selector,.hover");
	By subject_heading = By.id("id_contact");
	By email = By.id("email");
	By order_reference = By.id("order_reference");
	By message = By.id("message");
	By submit = By.id("submit");
	By error_message = By.className("alert-danger");
	
}
