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
import context.TestContext;
import pageFactory.HomePage;
import pageFactory.SignIn;
import pageFactory.SignOut;

public class SignIn_SD {
	
	TestContext testContext;
	WebDriver driver;
	HomePage hp;
	SignIn sip;
	
	public SignIn_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver=testContext.getDriver();
		this.hp=testContext.getHp();
		this.sip=testContext.getSip();
	}
	
	@When("Type Valid (.*) and (.*)$")
	public void type_valid_achievers_and_34df_sn_rzx_qa_rh(String username,String password){
		
		hp.username.sendKeys(username);
		hp.password.sendKeys(password);
	}

	@Then("You are logged in message should be displayed")
	public void you_are_logged_in_message_should_be_displayed() {
		
		String SigninText = sip.signInText.getText();
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
		
		String InValidText = sip.inValidText.getText();
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
		sip.WarningMessage();
	}


	@Then("Please fill out this field message should be displayed for password field")
	public void please_fill_out_this_field_message_should_be_displayed_for_password_field() {
		
		sip.WarningMessage();
	}

}
