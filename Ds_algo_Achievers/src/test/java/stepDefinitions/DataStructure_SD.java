package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import configuration.PropertiesFile;
import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


import pageFactory.HomePage;


import utilities.commonMethods;

public class DataStructure_SD {
      
	TestContext testContext;
	WebDriver driver;
	HomePage hp;
	
	
	public DataStructure_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	}

@When("The user clicks  Get Started button below the Data structures-Introduction")
public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
	// driver.get("https://dsportalapp.herokuapp.com/home");
	
     hp.getStartedBtn.click();
}


@When("The user directed to the DataStructure page and clicks Time Complexity button")
public void the_user_clicks_time_complexity_button() {
	//Assert.assertTrue(driver.getPageSource().contains("Data Structures-Introduction"));
	hp.timeComplexityBtn.click();
}

@Then("The user should be redirected to time complexity of Data structures-Introduction page")
public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction_page() {
	commonMethods.waitForElementToBeVisible(driver, hp.timeComplexityText);
	Assert.assertTrue(hp.timeComplexityText.isDisplayed());
}



@When("The user clicks the Try Here button")
public void the_user_clicks_the_try_here_button() {
	
//	ds.tryHereBtn.click();
	commonMethods.waitForElementToBeClickable(driver, hp.tryHereBtn);
	commonMethods.actionsClick(hp.tryHereBtn, driver);
	//ds.tryHereBtn.click();
}

@Then("The user is redirected to the Try Editor page and user enters the python code")
public void the_user_is_redirected_to_the_try_editor_page_and_user_enters_the_python_code() {
		Assert.assertTrue(driver.getPageSource().contains("Run"));
}

@When("The user enters the Python script")
public void the_user_enters_the_python_script() {
	commonMethods.waitForElementToBeClickable(driver, hp.InputText);
//	ds.InputText.sendKeys("print('hello')");
	commonMethods.actionsSendKeys(hp.InputText, driver, "print('hello')");
}

@When("The user clicks the Run button")
public void the_user_clicks_the_run_button() {
	hp.RunBtn.click();
}

@Then("The user is able to see the output")
public void the_user_is_able_to_see_the_output() {
	commonMethods.waitForElementToBeVisible(driver, hp.output);
	assertEquals(hp.output.getText(), "hello");
}

@When("The user enters the wrong python code and clicks Run button")
public void the_user_enters_the_wrong_python_code() {
	//ComonMthods.WaitForElementToBeVisible(driver, ds.InputText);
	commonMethods.actionsSendKeys(hp.InputText, driver, "hello");
	hp.RunBtn.click();
}

@Then("The user is able to see the error message")
public void the_user_is_able_to_see_the_error_message() {
	String alertmsg = driver.switchTo().alert().getText();
	System.out.println(alertmsg);
	//Assert.assertEquals(false, null);
	
	
}


@When("The user clicks the Practice Questions button")
public void the_user_clicks_the_practice_questions_button() {
	hp.practiceQuestionLink.click();
}

@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
	Assert.assertTrue(hp.PractceQuestion_page.isDisplayed());
}


@After 
public void CloseWindow() {
	//driver.close();
	driver.quit();
}
}



