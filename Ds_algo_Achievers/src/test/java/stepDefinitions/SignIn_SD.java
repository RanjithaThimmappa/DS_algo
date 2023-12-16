package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import Excel.Excelreader;
import context.TestContext;
import pageFactory.HomePage;
import pageFactory.SignIn;
import pageFactory.SignOut;
import utilities.DriverFactory;

public class SignIn_SD {
	
	TestContext testContext;
	WebDriver driver;
	HomePage hp;
	
	public SignIn_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver=testContext.getDriver();
		this.hp=testContext.getHp();
	}
	
	/*
	 * @When("User should be able to see SignIn button and click on it") public void
	 * user_clicks_on_sign_in_button() {
	 * Assert.assertTrue(hp.signInLink.isDisplayed()); hp.signInLink.click();
	 * 
	 * }
	 */
	
	@When("Type Valid (.*) and (.*)$")
	public void type_valid_achievers_and_34df_sn_rzx_qa_rh(String username,String password){
		
		hp.userName_SignIn.sendKeys(username);
		hp.passWord_SignIn.sendKeys(password);
	}

	/*
	 * @When("Clicks on Login link") public void clicks_on_login_link() {
	 * hp.login.click(); }
	 */
	
	@Then("You are logged in message should be displayed")
	public void you_are_logged_in_message_should_be_displayed() {
	//	Assert.assertTrue(si.signInText.isDisplayed());
		
		String SigninText = hp.signInText.getText();
		System.out.println(SigninText);
		Assert.assertEquals("You are logged in", SigninText);
	}
	

	@When("The User enters (.*) and (.*)$")
	public void the_user_enters_achievers1_and_34df_sn_rzx_qa_rh1(String username,String password) {
		hp.username.sendKeys(username);
		hp.password.sendKeys(password);
	}

	@Then("It should display a alert message: (.*)$")
	public void it_should_display_a_alert_message_invalid_username_and_password(String alert) {
		// Write code here that turns the phrase above into concrete actions
		
		String InValidText = hp.inValidText.getText();
		System.out.println(InValidText);
		Assert.assertEquals("Invalid Username and Password", alert);
		
	}


	@When("Types Invalid (.*) and (.*)$")
	public void types_invalid_achievers1_and_34df_sn_rzx_qa_rh1(String username,String password) {
		hp.username.sendKeys(username);
		hp.password.sendKeys(password);
	}

	@When("Types Invalid (.*) and valid (.*)$")
	public void types_invalid_achievers1_and_valid34df_sn_rzx_qa_rh(String username,String password) {
		hp.username.sendKeys(username);
		hp.password.sendKeys(password);
	}


	@Then("Please fill out this field message should be displayed for username field")
	public void please_fill_out_this_field_message_should_be_displayed_for_username_field() {
		hp.WarningMessage();
	}


	@Then("Please fill out this field message should be displayed for password field")
	public void please_fill_out_this_field_message_should_be_displayed_for_password_field() {
		
		hp.WarningMessage();
	}
	@After
	public void closeDriver() throws InterruptedException
	{
		Thread.sleep(0);
		driver.quit();
		
	}

}
