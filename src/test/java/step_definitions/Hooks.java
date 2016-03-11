package step_definitions;

import java.net.MalformedURLException;
import java.net.URL;
import helpers.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import static org.testng.AssertJUnit.assertEquals;

public class Hooks{
    public static WebDriver driver;
    // BROWSERSTACK. Note that environment variables are specified in the run configuration of the IDE
    public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY= System.getenv("BROWSERSTACK_KEY");
    public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

    String host = System.getProperty("host", "browserstack");
    String platform = System.getProperty("platform", "Windows");
    String os_version = System.getProperty("os_version", "8.1");
    String browserName = System.getProperty("browserName", "chrome");
    String browserVersion = System.getProperty("version", "48");
    private String sessionId;

    
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {
        Log.info("Called openBrowser");
        Log.info("Opening on " + host + " with " + platform + " platform and " + browserName + " browser, version " + browserVersion );

        if (host.equals("localhost")) {
            if (browserName.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver.exe");
                driver = new ChromeDriver();
            }
            if (browserName.equals("firefox")) {
                driver = new FirefoxDriver();
            }
        }

        else if (host.equals("browserstack")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", browserName);
            caps.setCapability("browser_version", browserVersion);
            caps.setCapability("os", platform);
            caps.setCapability("os_version", os_version);
            caps.setCapability("browserstack.debug", "true");
            driver = new RemoteWebDriver(new URL(URL), caps);
        }

        Log.info("Deleting cookies and maximising browser window");
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

    public static void type(String inputText, By locator) {
        find(locator).sendKeys(inputText);
    }

    public static void clear(By locator) {
        find(locator).clear();
    }

    public static void click(By locator) {
        find(locator).click();
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * returns the text from the provided DOM locator using Selenium's getText method
     * @param locator The webdriver element
     * @return String representing the inner HTML of the DOM element (MW: To check it is actually inner-text
     */
    public static String getText(By locator) {
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