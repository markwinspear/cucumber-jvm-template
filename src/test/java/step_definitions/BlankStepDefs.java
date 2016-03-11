package step_definitions;

import static step_definitions.Hooks.*;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlankStepDefs {
    public WebDriver driver;
    
    public BlankStepDefs()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open seleniumframework website$")
    public void i_open_seleniumframework_website() throws Throwable {
        visit("http://www.seleniumframework.com");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
      verifyPage("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.", "http://www.seleniumframework.com/");
    }
    
}