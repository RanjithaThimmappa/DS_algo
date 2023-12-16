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
import utilities.DriverFactory;
import utilities.commonMethods;
import static org.testng.Assert.*;

public class Stack_SD {
	
	/*
	 * WebDriver driver=DriverFactory.initializeDriver("Chrome"); Stack S=new
	 * Stack(driver); SignIn si = new SignIn(driver); SignOut SO = new
	 * SignOut(driver);
	 */

	
	TestContext testContext;
	WebDriver driver;
	HomePage hp;

	
	public Stack_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	} 
	

	/*
	 * @When("enters valid username and password and clicks on Login") public void
	 * enters_valid_username_and_password_and_clicks_on_login() {
	 * hp.username.sendKeys("Achievers"); hp.password.sendKeys("34dfSnRzx@QaRH");
	 * hp.login.click(); }
	 */
	@When("User Clicks on Get Started button of Stack datastructure")
	public void user_clicks_on_get_started_button_of_stack_datastructure() throws InterruptedException {
		hp.ClickonGetStartedButton();
           Thread.sleep(2000);
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

	/*
	 * @When("clicks on Try here on {string} page  enters valid code clicks on run")
	 * public void clicks_on_try_here_on_page_enters_valid_code_clicks_on_run(String
	 * string) throws InterruptedException {
	 * 
	 * hp.tryHere.click();
	 * commonMethods.waitForElementToBeVisible(driver,hp.pythonCode);
	 * commonMethods.actionsSendKeys(driver,hp.pythonCode,"print('Hello')");
	 * Thread.sleep(2000); hp.Run.click(); }
	 */
	/*
	 * @Then("output should be printed on the console for {string} page") public
	 * void output_should_be_printed_on_the_console_for_page(String string) throws
	 * InterruptedException { Thread.sleep(2000); System.out.println("Output is " +
	 * hp.Output.getText()); }
	 */

	/*
	 * @When("clicks on Try here on {string} page  enters invalid code clicks on run"
	 * ) public void
	 * clicks_on_try_here_on_page_enters_invalid_code_clicks_on_run(String string)
	 * throws InterruptedException {
	 * 
	 * hp.tryHere.click();
	 * commonMethods.waitForElementToBeVisible(driver,hp.pythonCode);
	 * commonMethods.actionsSendKeys(driver,hp.pythonCode,"Hello')1");
	 * Thread.sleep(2000); hp.Run.click(); }
	 * 
	 * @Then("Alert message should pop up for {string} page and click on ok and enter valid code"
	 * ) public void
	 * alert_message_should_pop_up_and_click_on_ok_and_enter_valid_code(String
	 * string) throws InterruptedException { String alertMessage =
	 * driver.switchTo().alert().getText() ; System.out.println(alertMessage);
	 * assertEquals(alertMessage ,"SyntaxError: bad input on line 1");
	 * driver.switchTo().alert().accept();
	 * 
	 * hp.clearText();
	 * commonMethods.waitForElementToBeVisible(driver,hp.pythonCode);
	 * commonMethods.actionsSendKeys(driver,hp.pythonCode,"print('Hello')");
	 * hp.Run.click();
	 * 
	 * 
	 * }
	 */
	
	/*
	 * @When("user clicks on  Practice questions") public void
	 * user_clicks_on_practice_questions() { hp.practiceQn.click();
	 * 
	 * }
	 */

	/*
	 * @Then("Blank page should be loaded") public void
	 * blank_page_should_be_loaded() {
	 * assertNotEquals(hp.practiceQn.getText(),"Practice Questions");
	 * 
	 * }
	 */
	
	@When("User clicks on Applications option")
	public void user_clicks_on_applications_option() {
		hp.Applications.click();

	}
	/*
	 * @When("User clicks on Data Structures drop down1") public void
	 * user_clicks_on_data_structures_drop_down1() { hp.DropDown.click(); }
	 */

	@When("User clicks on Stack option")
	public void user_clicks_on_Stack_option() {
		
		hp.stack_DropDown.click();
	}

	@Then("User should be redirected to Stack page")
	public void user_should_be_redirected_to_tree_page() {
		
		assertEquals(hp.stack_Text.getText(),"Stack");
	}


	@After
	public void closeDriver()
	{
		driver.quit();
	}
}
