package step_definitions;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptionList;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
	retryCount = 3,
	detailedReport = true,
	detailedAggregatedReport = true,
	overviewReport = false,
	toPDF = false,
	outputFolder = "target"
	)

//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumber-html-report",
		"junit:target/cucumber-junit.xml",
		"json:target/cucumber.json",
		"pretty:target/cucumber-pretty.txt"
		},
		features = "classpath:features",
	//	format = { "pretty", "json:target/cucumber.json"},
	//	plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
public class RunCukesTest{
	
}