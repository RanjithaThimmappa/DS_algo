package stepDefinitions;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Stack;
import utilities.commonMethods;
import static org.testng.Assert.*;

public class Stack_SD {
	
	TestContext testContext;
	WebDriver driver;
	Stack sp;
	
	public Stack_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.sp = testContext.getSp();
	} 
	
	@When("User Clicks on Get Started button of Stack datastructure")
	public void user_clicks_on_get_started_button_of_stack_datastructure() throws InterruptedException {
		sp.ClickonGetStartedButton();

	}

	@Then("User lands on Stack page and user should be able to see three <links> under topics covered")
	public void user_lands_on_stack_page_and_user_should_be_able_to_see_three_links_under_topics_covered() {
		commonMethods.waitForElementToBeVisible(driver, sp.Operations_in_Stack);
		assertEquals(sp.Operations_in_Stack.getText(),"Operations in Stack");
		commonMethods.waitForElementToBeVisible(driver, sp.Implementation);
		assertEquals(sp.Implementation.getText(),"Implementation");
		commonMethods.waitForElementToBeVisible(driver, sp.Applications);
		assertEquals(sp.Applications.getText(),"Applications");
		System.out.println(sp.Operations_in_Stack.getText());
		System.out.println(sp.Implementation.getText());
		System.out.println(sp.Applications.getText());
	}

	@When("user clicks on {string} in stack link")
	public void user_clicks_on_in_stack_link(String string) {
		if(string=="Operations in Stack") 
		{
			sp.Operations_in_Stack.click();
		}
		else if(string=="Implementation")
		{
			sp.Implementation.click(); 
		}
		else
		{
			sp.Applications.click();
		}
	}
	
	@When("User clicks on Applications option")
	public void user_clicks_on_applications_option() {
		sp.Applications.click();

	}
	
	@When("User clicks on Stack option")
	public void user_clicks_on_Stack_option() {
		
		sp.stack_DropDown.click();
	}

	@Then("User should be redirected to Stack page")
	public void user_should_be_redirected_to_tree_page() {
		
		assertEquals(sp.stack_Text.getText(),"Stack");
	}

}
