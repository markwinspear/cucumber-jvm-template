package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.AutomationHomePage;
import step_definitions.Hooks;

import static step_definitions.Hooks.*;


public class SignoutAction {

	public static void Execute(WebDriver driver) throws Exception{
		
		//AutomationHomePage.sign_out.click();
		click(AutomationHomePage.sign_out);
		Log.info("Sign out is performed");

		Reporter.log("Sign out is performed");

	}
}
