package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import context.TestContext;
import io.cucumber.java.en.*;
import pageFactory.QueuePage;
import utilities.commonMethods;

public class Queue_SD {

	TestContext testContext;
	WebDriver driver;
	QueuePage qp;

	public Queue_SD(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.qp = testContext.getQp();
	}

	@When("The user clicks GetStarted button below the Queue")
	public void the_user_clicks_get_started_button_below_the_queue() {
		qp.GetStartedBtn.click();
		Assert.assertEquals(qp.QueueText.getText(), "Queue");

	}
	@When("The user clicks the Implementation of Queue in Python link")
	public void the_user_clicks_the_implementation_of_queue_in_python_link() {
		commonMethods.actionsClick(qp.ImplemntatnOfQueInPythn_Link, driver);
	}
	@Then("The user should be directed to the Implementation of Queue in Python page")
	public void the_user_should_be_directed_to_the_implementation_of_queue_in_python_page() {
		commonMethods.waitForElementToBeClickable(driver, qp.ImplemntatnOfQueInPythn_Text);
		Assert.assertEquals(qp.ImplemntatnOfQueInPythn_Text.getText(), "Implementation of Queue in Python");
	}
	@When("The user clicks the Implementation using collections.deque link")
	public void the_user_clicks_the_implementation_using_collections_deque_link() {
		commonMethods.waitForElementToBeClickable(driver, qp.ImplemntatnCollectn_Link);
		commonMethods.actionsClick(qp.ImplemntatnCollectn_Link, driver);

	}
	@Then("The user should be directed to the Implementation using collections.deque page")
	public void the_user_should_be_directed_to_the_implementation_using_collections_deque_page() {
		Assert.assertEquals(qp.ImplemntatnCollectn_Text.getText(), "Implementation using collections.deque");
	}
	@When("The user clicks the Implementation using array link")
	public void the_user_clicks_the_implementation_using_array_link() {
		commonMethods.waitForElementToBeClickable(driver, qp.ImplemnatatnUsingArray_Link);
		commonMethods.actionsClick(qp.ImplemnatatnUsingArray_Link, driver);
	}
	@Then("The user should be directed to the Implementation using array page")
	public void the_user_should_be_directed_to_the_implementation_using_array_page() {
		Assert.assertEquals(qp.ImplemnatatnUsingArray_Text.getText(),"Implementation using array");

	}
	@When("The user clicks the Queue Operations link")
	public void the_user_clicks_the_queue_operations_link() {
		commonMethods.waitForElementToBeClickable(driver, qp.QueueOperatn_Link);
		commonMethods.actionsClick(qp.QueueOperatn_Link, driver);

	}
	@Then("The user should be directed to the Queue Operations page")
	public void the_user_should_be_directed_to_the_queue_operations_page() {
		Assert.assertTrue(qp.QueueOperatn_Text.isDisplayed());

	}

	@Then("The user should be directed to the TryEditor Page")
	public void the_user_directed_to_the_try_editot_page() {
		Assert.assertEquals(qp.runbtn.getText(), "Run");
	}
	@When("The user enter the python script")
	public void the_user_enter_the_python_script() {
		commonMethods.waitForElementToBeClickable(driver,qp.Input_PythonCode);
		commonMethods.actionsSendKeys( driver, qp.Input_PythonCode, "print(1)");
	}

	@Then("The user is able to see the output of the code")
	public void the_user_is_able_to_see_the_output() {
		Assert.assertTrue(qp.PythonCode_Output.isDisplayed());
	}
	@When("The user enters the wrong python script")
	public void the_user_enters_the_wrong_python_script() {
		commonMethods.waitForElementToBeClickable(driver, qp.Input_PythonCode);
		commonMethods.actionsSendKeys(driver, qp.Input_PythonCode,  "hello");
	}
	@Then("The user is able to see the errormessage in the page")
	public void the_user_is_able_to_see_the_errormessage_in_the_page() {

		driver.switchTo().alert().accept();

	}
	@When("The user clicks the practice Question link")
	public void the_user_clicks_the_practice_question_link() {
		commonMethods.actionsClick(qp.practiceQuestion_Link, driver);

	}
	@Then("The user should be directed to the Practice Question Page")
	public void the_user_should_be_directed_to_the_practice_question_page() {
		Assert.assertTrue(qp.practiceQuestion_page.isDisplayed());
	}
	@When("The user clicks the practice Questions link")
	public void the_user_clicks_the_practice_questions_link() {
		commonMethods.actionsClick(qp.practiceQuestion_Link, driver);
	}
	@When("The user should be directed to the practice Questions page")
	public void the_user_should_be_directed_to_the_practice_questions_page() {
		Assert.assertTrue(qp.practiceQuestion_page.isDisplayed());
	}
	@When("The user clicks the link Implementation using collections.deque")
	public void the_user_clicks_the_link_implementation_using_collections_deque() {
		commonMethods.actionsClick(qp.ImplementationColectn_Deque, driver);
	}
	@When("The user redircted to the page Implementation using collections.deque")
	public void the_user_redircted_to_the_page_implementation_using_collections_deque() {
		qp.ImplementationColectn_Deque.isDisplayed();
	}
	@When("The user clicks the link Implementation using array")
	public void the_user_clicks_the_link_implementation_using_array() {
		commonMethods.actionsClick(qp.Implemenetaion_Using_ArrayLink2, driver);
	}
	@When("The user redircted to the page Implementation using array")
	public void the_user_redircted_to_the_page_implementation_using_array() {
		qp.Implemenetaion_Using_ArrayLink2.isDisplayed();
	}
	@When("The user clicks the link Queue Operations")
	public void the_user_clicks_the_link_queue_operations() {
		commonMethods.actionsClick(qp.QueueOperatn_Link2, driver);
	}
	@When("The user redircted to the page Queue Operations")
	public void the_user_redircted_to_the_page_queue_operations() {
		qp.QueueOperatn_Link2.isDisplayed();
	}
	@When("The user clicks the link practice Questions")
	public void the_user_clicks_the_link_practice_questions() {
		commonMethods.actionsClick(qp.practiceQuestion_Link, driver);
	}
	@When("The user redircted to the page practice Questions")
	public void the_user_redircted_to_the_page_practice_questions() {
		qp.practiceQuestion_page.isDisplayed();
	}

}

