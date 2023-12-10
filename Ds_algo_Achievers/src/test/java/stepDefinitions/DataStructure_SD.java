package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

import pageFactory.DataStructure;
import utilities.DriverFactory;

public class DataStructure_SD {
      
	WebDriver driver =DriverFactory.initializeDriver("chrome");
	DataStructure ds = new DataStructure(driver);
	
@Given("The user is on Sign In page")
public void the_user_is_on_sign_in_page() {
	driver= DriverFactory.initializeDriver("chrome");
	ds.SignInBtn.click();
}

@When("The user enters username and password")
public void the_user_enters_username_and_password() {
	ds.username.sendKeys("Achievers");
	ds.password.sendKeys("34dfSnRzx@QaRH");
}

@When("User clicks on the login button")
public void user_clicks_on_the_login_button() {
	ds.loginBtn.click();
}

@Then("The user is in the home page where user is able to see the Signout button of the user")
public void the_user_is_in_the_home_page() {
	Assert.assertTrue(ds.SignOutBtn.isDisplayed());
}

@When("The user clicks  Get Started button below the Data structures-Introduction")
public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
     ds.getStartedBtn.click();
}

@Then("The user should land in Data Structures- Introduction Page")
public void the_user_should_land_in_data_structures_introduction_page() {
	Assert.assertEquals("Data Structures-Introduction", ds.dataStructureText);
}

@When("The user clicks Time Complexity button")
public void the_user_clicks_time_complexity_button() {
	ds.timeComplexityBtn.click();
}

@Then("The user should be redirected to time complexity of Data structures-Introduction page")
public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction_page() {
	Assert.assertTrue(ds.timeComplexityText.isDisplayed());
}

@When("The user clicks the Try Here button")
public void the_user_clicks_the_try_here_button() {
	ds.tryHereBtn.click();
}

@Then("The user is redirected to the Try Editor page")
public void the_user_is_redirected_to_the_try_editor_page() {
	Assert.assertEquals("Run", ds.RunBtn);
}

@Then("The user clicks the Run button")
public void the_user_clicks_the_run_button() {
	ds.RunBtn.click();
}

@Given("The user navigate back to the Time complexity page")
public void the_user_navigate_back_to_the_time_complexity_page() {
	driver.navigate().back();
	Assert.assertTrue(ds.timeComplexityText.isDisplayed());
}

@When("The user clicks the Practice Questions button")
public void the_user_clicks_the_practice_questions_button() {
    ds.practiceQuestionBtn.click();
}

@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
     Assert.assertTrue(driver.getPageSource().contains("Practice Questions")); 
}





}