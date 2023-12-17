package stepDefinitions;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.SignIn;
import pageFactory.SignOut;
import pageFactory.Stack;
import utilities.commonMethods;
import static org.testng.Assert.*;

public class Stack_SD {
	
	TestContext testContext;
	WebDriver driver;
	HomePage hp;
	
	public Stack_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	} 
	
	@When("User Clicks on Get Started button of Stack datastructure")
	public void user_clicks_on_get_started_button_of_stack_datastructure() throws InterruptedException {
		hp.ClickonGetStartedButton();

	}

	@Then("User lands on Stack page and user should be able to see three <links> under topics covered")
	public void user_lands_on_stack_page_and_user_should_be_able_to_see_three_links_under_topics_covered() {
		commonMethods.waitForElementToBeVisible(driver, hp.Operations_in_Stack);
		assertEquals(hp.Operations_in_Stack.getText(),"Operations in Stack");
		commonMethods.waitForElementToBeVisible(driver, hp.Implementation);
		assertEquals(hp.Implementation.getText(),"Implementation");
		commonMethods.waitForElementToBeVisible(driver, hp.Applications);
		assertEquals(hp.Applications.getText(),"Applications");
		System.out.println(hp.Operations_in_Stack.getText());
		System.out.println(hp.Implementation.getText());
		System.out.println(hp.Applications.getText());
	}

	@When("user clicks on {string} in stack link")
	public void user_clicks_on_in_stack_link(String string) {
		if(string=="Operations in Stack") 
		{
			hp.Operations_in_Stack.click();
		}
		else if(string=="Implementation")
		{
			hp.Implementation.click(); 
		}
		else
		{
			hp.Applications.click();
		}
	}
	
	@When("User clicks on Applications option")
	public void user_clicks_on_applications_option() {
		hp.Applications.click();

	}
	
	@When("User clicks on Stack option")
	public void user_clicks_on_Stack_option() {
		
		hp.stack_DropDown.click();
	}

	@Then("User should be redirected to Stack page")
	public void user_should_be_redirected_to_tree_page() {
		
		assertEquals(hp.stack_Text.getText(),"Stack");
	}

}
