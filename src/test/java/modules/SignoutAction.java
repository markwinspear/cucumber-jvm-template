package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import static step_definitions.Hooks.*;
import pageobjects.AutomationHomePage;



public class SignoutAction {

	public static void Execute(WebDriver driver) throws Exception{
		
		//AutomationHomePage.sign_out.click();
		click(AutomationHomePage.sign_out);
		Log.info("Sign out is performed");

		Reporter.log("Sign out is performed");

	}
}
