package stepDefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Config.PropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import utilities.DriverFactory;
import utilities.commonMethods;
import static org.testng.Assert.*;

public class HomePage_SD{

	WebDriver driver; 
	HomePage hp;
	
	@Before
	public void setUp(){
		String value = PropertiesFile.readPropertiesFile("browser");		
		this.driver = DriverFactory.initializeDriver(value);
		this.hp = new HomePage(driver);
//		this.driver = new ChromeDriver();
	}
	
	@When("User enters homepage url")
	public void user_enters_homepage_url() {
		String url = PropertiesFile.readPropertiesFile("getStartedPageUrl");
		driver.get(url);
	}

	@Then("User should be able to navigate to the home page and see the text - Preparing for the Interviews You are at the right place")
	public void user_should_be_able_to_navigate_to_the_home_page_and_see_the_text_preparing_for_the_interviews_you_are_at_the_right_place() {

		String homeText = hp.getHomePageText();
		assertEquals("Preparing for the Interviews", homeText); 
	}

	@Then("User should see the Get Started button")
	public void user_should_see_the_get_started_button() {

		assertTrue(hp.getStartedButtonHP.isDisplayed());
	}

	@When("User Clicks on Get Started")
	public void user_clicks_on_get_started() {

		hp.getStartedButtonHP.click();
	}

	@Then("Home Page is displayed with the all the seven datastructure modules")
	public void home_page_is_displayed_with_the_all_the_seven_datastructure_modules() {

		List<String> moduleNames = commonMethods.printTextForWebElements(hp.dsModuleTitles);
		System.out.println(moduleNames);
		assertEquals(7, moduleNames.size());

	}

	@Then("User should be able to see the Register link")
	public void user_should_be_able_to_see_the_register_link() {

		assertTrue(hp.registerLink.isDisplayed());
	}

	@Then("User should be able to see the Sign in link")
	public void user_should_be_able_to_see_the_sign_in_link() {

		assertTrue(hp.signInLink.isDisplayed());
	}

	@Then("User should be able to see the datastructures dropdown")
	public void user_should_be_able_to_see_the_datastructures_dropdown() throws InterruptedException {

		assertTrue(hp.dsDropDown.isDisplayed());

	}


	@When("User Clicks on the datastructures dropdown menu")
	public void user_clicks_on_the_datastructures_dropdown_menu() {

		hp.dsDropDown.click();
	}

	@Then("All the six datastructure modules should be displayed")
	public void all_the_six_datastructure_modules_should_be_displayed() {

		List<String> options = commonMethods.printTextForWebElements(hp.dsDropDownOptions);
		System.out.println(options);
		assertEquals(6, options.size());
	}

	@When("User clicks on the Get Started button on any of the modules")
	public void user_clicks_on_the_get_started_button_on_any_of_the_modules() {

		hp.getStartedButton_DSIntroductionModule.click();
	}

	@Then("It should alert the user with the message - You are not logged in")
	public void it_should_alert_the_user_with_the_message_you_are_not_logged_in() {

		String alert = hp.notLoggedInAlert.getText();
		System.out.println(alert);
		assertEquals("You are not logged in", alert);
	}

	@When("User clicks on the Sign in link")
	public void user_clicks_on_the_sign_in_link() {

		hp.signInLink.click();
	}

	@Then("User gets redirected to the Sign in page and see the username field and password field")
	public void user_gets_redirected_to_the_sign_in_page_and_see_the_username_field_and_password_field() {

		if(hp.userName_SignIn.isDisplayed()&& hp.passWord_SignIn.isDisplayed()) {
			assertTrue(true);
		}
		else {
			assertTrue(false);

		}
	}

	@Then("User should be able to see the message - If you don't have an account, please Register!")
	public void user_should_be_able_to_see_the_message_if_you_don_t_have_an_account_please_register() {

		assertEquals("Register!", hp.pleaseRegisterMessageLink.getText());//Not able to print the message
	}

	@When("User clicks on the Register Link")
	public void user_clicks_on_the_register_link() {

		hp.registerLink.click();
	}

	@Then("User is redirected on the Register Page and should be able to see the Register button")
	public void user_is_redirected_on_the_register_page_and_should_be_able_to_see_the_register_button() {

		assertTrue(hp.registerButton.isDisplayed());
	}
	
	@After // This is Hook and is working fine but not sure why it's throwing SocketException with this method
	public void tearDown() {	
//		driver.close();// Using this throws socket exception.
		driver.quit();
	}

}


