package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageFactory.HomePage;

public class MyHooks {

	TestContext testContext;
	static WebDriver driver;
	
	public MyHooks(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@Before
	public void setUp1(){
		testContext.setDriver(driver);
		driver = testContext.getDriver();
		testContext.initializePageObjects(driver);		
		
	}
	
	@After 
	public void tearDown() {	
		driver.quit();
	}
	
	@AfterStep
	public static void takeScreenshot(Scenario scenario) {
		
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
	}

}
