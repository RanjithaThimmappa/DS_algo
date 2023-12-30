package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utilities.commonMethods;
import org.testng.Assert;
import static org.testng.Assert.*;
import Config.PropertiesFile;
import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.SignIn;
import pageFactory.SignOut;

public class Signout_SD {
	
	TestContext testContext;
	WebDriver driver;
	HomePage hp;
	SignOut sop;
	
	public Signout_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
		this.sop = testContext.getSop();
	} 

	@Then("User is not able to see Signout Link Text")
	public void user_is_not_able_to_see_signout_link_text() {

		assertFalse(sop.verifySignoutText());
	}

	@Given("User Clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		hp.signInLink.click();
	}

	@Given("Enters (.*) and (.*)$")
	public void enters_username_and_password(String username, String password) {
		hp.username.sendKeys(username);
		hp.password.sendKeys(password);
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
		sop.login.click();
	}

	@When("User should be able to see SignOut button and click on it")
	public void user_should_be_able_to_see_sign_out_button_and_click_on_it() {
		sop.signOutLink.click();
	}

	@Then("Logged out successfully text should be displayed")
	public void logged_out_successfully_text_should_be_displayed() {

		Assert.assertTrue(sop.loggedOutText.isDisplayed());
	}

	@Then("clicks on Get Started button from any of the datastaructures then You are not logged in text should be displayed")
	public void clicks_on_get_started_button_from_any_of_the_datastaructures() throws InterruptedException {
		sop.verifyGetStartedButton();

	}

}
