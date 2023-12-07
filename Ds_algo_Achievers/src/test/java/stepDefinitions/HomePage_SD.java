package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageFactory.HomePage;
import utilities.DriverFactory;
import utilities.commonMethods;

public class HomePage_SD {

	WebDriver driver = DriverFactory.initializeDriver("Chrome");
	HomePage hp = new HomePage(driver);
	
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	@SuppressWarnings("deprecation")
	@Then("User should be able to navigate to the home page and see the text - Preparing for the Interviews You are at the right place")
	public void user_should_be_able_to_navigate_to_the_home_page_and_see_the_text_preparing_for_the_interviews_you_are_at_the_right_place() {
		
		String homeText = hp.homePageText.getText();
		Assert.assertEquals("Preparing for the Interviews", homeText); 
	}
	
	@SuppressWarnings("deprecation")
	@Then("User should see the Get Started button")
	public void user_should_see_the_get_started_button() {
		
		Assert.assertTrue(hp.getStartedButtonHP.isDisplayed());
	}

	@When("User Clicks on Get Started")
	public void user_clicks_on_get_started() {
		
		hp.getStartedButtonHP.click();
	}

	@SuppressWarnings("deprecation")
	@Then("Home Page is displayed with the all the seven datastructure modules")
	public void home_page_is_displayed_with_the_all_the_seven_datastructure_modules() {
		
		List<String> moduleNames = commonMethods.printTextForWebElements(hp.dsModuleTitles);
		System.out.println(moduleNames);
		Assert.assertEquals(7, moduleNames.size());
		
	}

	@SuppressWarnings("deprecation")
	@Then("User should be able to see the Register link")
	public void user_should_be_able_to_see_the_register_link() {
		
		Assert.assertTrue(hp.registerLink.isDisplayed());
	}
	
	@SuppressWarnings("deprecation")
	@Then("User should be able to see the Sign in link")
	public void user_should_be_able_to_see_the_sign_in_link() {
		
		Assert.assertTrue(hp.signInLink.isDisplayed());
	}

	@SuppressWarnings("deprecation")
	@Then("User should be able to see the datastructures dropdown")
	public void user_should_be_able_to_see_the_datastructures_dropdown() {
		
		Assert.assertTrue(hp.dsDropDown.isDisplayed());
	   
	}


	@When("User Clicks on the datastructures dropdown menu")
	public void user_clicks_on_the_datastructures_dropdown_menu() {
		
		hp.dsDropDown.click();
	}

	@SuppressWarnings("deprecation")
	@Then("All the six datastructure modules should be displayed")
	public void all_the_six_datastructure_modules_should_be_displayed() {
		
		List<String> options = commonMethods.printTextForWebElements(hp.dsDropDownOptions);
		System.out.println(options);
		Assert.assertEquals(6, options.size());
	}

	@When("User clicks on the Get Started button on any of the modules")
	public void user_clicks_on_the_get_started_button_on_any_of_the_modules() {
		
		hp.getStartedButton_DSIntroductionModule.click();
	}

	@SuppressWarnings("deprecation")
	@Then("It should alert the user with the message - You are not logged in")
	public void it_should_alert_the_user_with_the_message_you_are_not_logged_in() {
		
		String alert = hp.notLoggedInAlert.getText();
		System.out.println(alert);
		Assert.assertEquals("You are not logged in", alert);
	}

	@When("User clicks on the Sign in link")
	public void user_clicks_on_the_sign_in_link() {
		
		hp.signInLink.click();
	}

	@SuppressWarnings("deprecation")
	@Then("User gets redirected to the Sign in page and see the username field and password field")
	public void user_gets_redirected_to_the_sign_in_page_and_see_the_username_field_and_password_field() {
		
		if(hp.userName_SignIn.isDisplayed()&& hp.passWord_SignIn.isDisplayed()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
			
		}
	}

	@SuppressWarnings("deprecation")
	@Then("User should be able to see the message - If you don't have an account, please Register!")
	public void user_should_be_able_to_see_the_message_if_you_don_t_have_an_account_please_register() {
		
		Assert.assertEquals("Register!", hp.pleaseRegisterMessageLink.getText());//Not able to print the message
	}

	@When("User clicks on the Register Link")
	public void user_clicks_on_the_register_link() {
		
		hp.registerLink.click();
	}

	@SuppressWarnings("deprecation")
	@Then("User is redirected on the Register Page and should be able to see the Register button")
	public void user_is_redirected_on_the_register_page_and_should_be_able_to_see_the_register_button() {
		
		Assert.assertTrue(hp.registerButton.isDisplayed());
	}
	
}


