package stepDefinitions;

import static org.testng.Assert.*;
import org.openqa.selenium.WebDriver;
import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LinkedlistPage;
import utilities.commonMethods;

public class Linkedlist_SD {
	TestContext testContext;
	WebDriver driver;
	LinkedlistPage lp;
	
	public Linkedlist_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.lp = testContext.getLp();
	}
	
	@When("User Clicks on the Get Started button for Linkedlist Page")
	public void user_clicks_on_the_get_started_button_for_linkedlist_page() {
		 lp.getStartedButton_LinkedlistModule.click();
	}

	@When("The User clicks on {string} link for Linkedlist Page")
	public void the_user_clicks_on_link_for_linkedlist_page(String string) {
		if("Introduction".equals(string)){
			lp.Introduction_link.click();
		  }
		else if("Creating Linked List".equals(string)) {
			 lp.creatingLinkedList_link.click();
		  }
		else if("Types of Linked List".equals(string)) {
			lp. Typesoflinkedlist_link.click();
			}
		else if("Implement Linked List in Python".equals(string)){
			 lp.implementLinkedlistInPython_link.click();
			} 
		else if("Traversal".equals(string)) {
			lp.traversal_link.click();
		}
		else if("insertion-in-linked-list".equals(string)) {
			lp.insertionInLinkedlist_link.click();
		}
		else {
			lp.deletionInLinkedlist_link.click();
		}	 
	}

	@When("User clicks on Introduction link")
	public void user_clicks_on_introduction_link() {
	    lp.Introduction_link.click();
	}

	@When("User enters incorrect  code")
	public void user_enters_incorrect_code() {
		commonMethods.waitForElementToBeVisible(driver, lp.codeEditorPage);
		lp.codeEditorPage.click();
		commonMethods.actionsSendKeys(driver,lp.codeEditorPage,"print('Hello');;");
	}

	@Then("User must be able to see the alert message")
	public void user_must_be_able_to_see_the_alert_message() {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		assertEquals(alertMessage,"SyntaxError: bad input on line 1");
	}

	@When("The user select Linkedlist from the drop down menu")
	public void the_user_select_linkedlist_from_the_drop_down_menu() {
		lp.dsDropDown.click();
	}

	@When("The user clicks on the Linkedlist")
	public void the_user_clicks_on_the_linkedlist() {
		lp.Linkedlist.click();
	}

	@Then("The user should be navigated to the Linkedlist Page")
	public void the_user_should_be_navigated_to_the_linkedlist_page() {
		assertEquals(lp.LinkedListPage.getText(),"Linked List");
	}

	@When("User clicks on Linkedlist Introduction link")
	public void user_clicks_on_linkedlist_introduction_link() {
		lp.Introduction_link.click();
	}

	@When("User on the linkedlist Introduction Page and clicks on Practice Questions Link")
	public void user_on_the_linkedlist_introduction_page_and_clicks_on_practice_questions_link() {
		lp.practicequestionLink.click();
	}

	@Then("User must be redirected to Practice page for Linkedlist Introduction")
	public void user_must_be_redirected_to_practice_page_for_linkedlist_introduction() {
		assertNotEquals(lp.practiceQuestions_Text.getText(),"Practice Questions");
	}
	
}