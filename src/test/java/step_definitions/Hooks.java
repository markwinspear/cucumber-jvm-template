package step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

public class Hooks{
    public static WebDriver driver;

    String host = System.getProperty("host", "localhost");
    String browser = System.getProperty("browser", "chrome");
    
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {
    	System.out.println("Called openBrowser");

        if (host.equals("localhost")) {
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    }

    public static void visit(String url) {
        driver.get(url);
    }

    public static void verifyPage(String expectedTitle, String expectedUrl) {
        assertEquals(expectedTitle ,driver.getTitle());
        assertEquals(expectedUrl ,driver.getCurrentUrl());
    }

    public WebElement find(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public void submit(By locator) {
        find(locator).submit();
    }

    public void type(String inputText, By locator) {
        find(locator).sendKeys(inputText);
    }

    public void clear(By locator) {
        find(locator).clear();
    }

    public void click(By locator) {
        find(locator).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * returns the text from the provided DOM locator using Selenium's getText method
     * @param locator The webdriver element
     * @return String representing the inner HTML of the DOM element (MW: To check it is actually inner-text
     */
    public String getText(By locator) {
        return find(locator).getText();
    }

    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.quit();
        
    }
    
}