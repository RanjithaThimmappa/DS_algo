package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			monochrome = false,  //console output formatting
			tags = "@DSALGO", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"stepDefinitions","hooks"}, //location of step definition files
			plugin = {"pretty", //For the Detailed output and generating reports.
						"html:target/Cucumber-Reports/dsAlgo.html" , 
						"json:target/Cucumber-Reports/dsAlgo.json" , 
						"junit:target/Cucumber-Reports/dsAlgo.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"} 
			) 


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
			
			return super.scenarios();
	    }


}
