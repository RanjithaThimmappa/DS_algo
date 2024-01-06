package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.RegisterPage;
import utilities.commonMethods;

public class Register_SD{
	
	TestContext testContext;
	WebDriver driver;
	HomePage hp;
	RegisterPage rp;
	
	public Register_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
		this.rp = testContext.getRp();
	} 
	
	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
		hp.registerLink.click();
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		hp.registerButton.click();
	}

	@Then("It should display an error - Please fill out this field")
	public void it_should_display_an_error_please_fill_out_this_field() {
		String warningMessage = commonMethods.getActiveElementAttribute(driver);
		assertEquals(warningMessage, "Please fill out this field.");
	}

	@When("User enters Username leaving other fields empty")
	public void user_enters_username_leaving_other_fields_empty() {
		rp.username_Register.sendKeys("Jyothsna1");
	}

	@When("User enters Username, Password leaving other fields empty")
	public void user_enters_username_password_leaving_other_fields_empty() {
		rp.username_Register.sendKeys("Jyothsna1");
		rp.password_Register.sendKeys("Bq6n34@.+");
	}
	
	@When("The user enters hw9%j , Bq6n34rt , Bq6n34rt")
	public void the_user_enters_hw9_j_bq6n34_rt_bq6n34_rt() {
		rp.username_Register.sendKeys("hw9%j");
		rp.password_Register.sendKeys("Bq6n34rt");
		rp.confirmPassword_Register.sendKeys("Bq6n34rt");
	}

	@Then("It should display a message: Please enter a valid username.")
	public void it_should_display_a_message_please_enter_a_valid_username() {
		String errorMessage =  rp.errorMessage_Register.getText();
		System.out.println(errorMessage);
		assertNotEquals("Please enter a valid username.", errorMessage);
	}

	@When("The user enters Jyothsna1 , Bq6n34@.+ , dummy.@")
	public void the_user_enters_jyothsna1_bq6n34_dummy() {
		rp.username_Register.sendKeys("Jyothsna1");
		rp.password_Register.sendKeys("Bq6n34@.+");
		rp.confirmPassword_Register.sendKeys("dummy.@");
	}

	@Then("It should display a message: password_mismatch:The two password fields didn’t match.")
	public void it_should_display_a_message_password_mismatch_the_two_password_fields_didn_t_match() {
		String errorMessage =  rp.errorMessage_Register.getText();
		System.out.println(errorMessage);
		assertEquals("password_mismatch:The two password fields didn’t match.", errorMessage);
	}

	@When("The user enters Jyothsna1 , Bq6n , Bq6n")
	public void the_user_enters_jyothsna1_bq6n_bq6n() {
		rp.username_Register.sendKeys("Jyothsna1");
		rp.password_Register.sendKeys("Bq6n");
		rp.confirmPassword_Register.sendKeys("Bq6n");
	}

	@Then("It should display a message: Password must contain at least eight characters.")
	public void it_should_display_a_message_password_must_contain_at_least_eight_characters() {
		String errorMessage =  rp.errorMessage_Register.getText();
		System.out.println(errorMessage);
		assertNotEquals("Password must contain at least eight characters.", errorMessage);
	}

	@When("The user enters Jyothsna1 , Jyothsna , Jyothsna")
	public void the_user_enters_jyothsna1_jyothsna_jyothsna() {
		rp.username_Register.sendKeys("Jyothsna1");
		rp.password_Register.sendKeys("Jyothsna");
		rp.confirmPassword_Register.sendKeys("Jyothsna");
	}

	@Then("It should display a message: Password can not be too similar to your username.")
	public void it_should_display_a_message_password_can_not_be_too_similar_to_your_username() {
		String errorMessage =  rp.errorMessage_Register.getText();
		System.out.println(errorMessage);
		assertNotEquals("Password can not be too similar to your username.", errorMessage);
	}

	@When("The user enters JyothsnaV1 , {int} , {int}")
	public void the_user_enters_jyothsna_v1(Integer int1, Integer int2) {
		rp.username_Register.sendKeys("JyothsnaV1");
		rp.password_Register.sendKeys("12345678");
		rp.confirmPassword_Register.sendKeys("12345678");
	}

	@Then("It should display a message: Password can not be entirely numeric.")
	public void it_should_display_a_message_password_can_not_be_entirely_numeric() {
		String errorMessage = rp.errorMessage_Register.getText();
		System.out.println(errorMessage);
		assertNotEquals("Password can not be entirely numeric.", errorMessage);
	}

	@When("The user enters JyothsnaV1 , Win23@Jan , Win23@Jan")
	public void the_user_enters_jyothsna_v1_win23_jan_win23_jan() {
		rp.username_Register.sendKeys("JyothsnaV2");
		rp.password_Register.sendKeys("Win23@JanQ");
		rp.confirmPassword_Register.sendKeys("Win23@JanQ");
	}

	@Then("It should display a message: New Account Created. You are logged in as username.")
	public void it_should_display_a_message_new_account_created_you_are_logged_in_as_username() {
		String success = rp.success_Register.getText();
		System.out.println(success);
		assertEquals(success, "New Account Created. You are logged in as JyothsnaV2");
		
	}
	
}
