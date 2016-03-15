package step_definitions;

import static org.junit.Assert.assertThat;
import static step_definitions.Hooks.*;
import static org.hamcrest.CoreMatchers.*;


import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

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
      //OR alternatively...
      assertThat(driver.getTitle(), is(equalTo("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.")));
    }
    
}