package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DataStructure;
import pageFactory.HomePage;
import utilities.DriverFactory;

public class HomePage_SD {
   
	WebDriver driver;
	HomePage hp = new HomePage(driver);
	@Given("User enters the  URL")
	public void user_enters_the_url() {
		driver = DriverFactory.initializeDriver("chrome");
		driver.get("https://dsportalapp.herokuapp.com");
	    
	}

	@Then("User should be able to navigate to  the home page and   see the text-Preparing for the Interviews You are at the right place")
	public void user_should_be_able_to_navigate_to_the_home_page_and_see_the_text_preparing_for_the_interviews_you_are_at_the_right_place() {
		
	}

	@Then("User should see the Get  Started button")
	public void user_should_see_the_get_started_button() {

	}

	@Given("User opens the homepage")
	public void user_opens_the_homepage() {
	    
	}

	@When("User Clicks on Get Started")
	public void user_clicks_on_get_started() {
		
	}

	@Then("Home Page is displayed with the all the seven datastructure modules")
	public void home_page_is_displayed_with_the_all_the_datastructure_modules() {
	   
	}

	@Then("User should also  see the Register and Sign in links")
	public void user_should_also_see_the_register_and_sign_in_links() {
	  
	}

	@Then("User should be able to see the datastructures  dropdown")
	public void user_should_be_able_to_see_the_datastructures_dropdown() {
	    
	}

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
	    
	}

	@When("User Clicks on the datastructures dropdown menu")
	public void user_clicks_on_the_datastructures_dropdown_menu() {
	    
	}

	@Then("All the six  datastructure modules should be  displayed")
	public void all_the_six_datastructure_modules_should_be_displayed() {
	  	}

	@When("User clicks on the Get Started button on any of the module")
	public void user_clicks_on_the_get_started_button_on_any_of_the_module() {
	    
	}

	@Then("It should alert the user with the message-You are not logged in")
	public void it_should_alert_the_user_with_the_message_you_are_not_logged_in() {
	    
	}

	@Given("User is on the Home Page")
	public void user_is_on_the_home_page() {
	    
	}

	@When("User clicks on  the Sign in button")
	public void user_clicks_on_the_sign_in_button() {
	   	}

	@Then("User gets redirected to the Sign in page and see the username field and password field")
	public void user_gets_redirected_to_the_sign_in_page_and_see_the_username_field_and_password_field() {
	   
	}

	@Then("User should be able to see the message If you don't have an account, please Register!")
	public void user_should_be_able_to_see_the_message_if_you_don_t_have_an_account_please_register() {
	}

	@Given("User is on homepage")
	public void user_is_on_homepage() {
	    
	}

	@When("User clicks on the Register button")
	public void user_clicks_on_the_register_button() {
	    
	}

	@Then("User is redirected on the Register Page  and should be able to see the Register button")
	public void user_is_redirected_on_the_register_page_and_should_be_able_to_see_the_register_button() {
	    
	    
}}

