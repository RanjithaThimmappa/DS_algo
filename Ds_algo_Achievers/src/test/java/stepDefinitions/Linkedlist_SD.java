package stepDefinitions;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import context.Testcontext;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LinkedlistPage;
import utilities.DriverFactory;
import utilities.commonMethods;


public class Linkedlist_SD {
	Testcontext testContext;
	HomePage hp;
	WebDriver driver;
	
	public Linkedlist_SD(Testcontext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	}
	
	@When("User Clicks on the Get Started button for Linkedlist Page")
	public void user_clicks_on_the_get_started_button_for_linkedlist_page() {
		 hp.getStartedButton_LinkedlistModule.click();
	}

	@When("The User clicks on {string} link for Linkedlist Page")
	public void the_user_clicks_on_link_for_linkedlist_page(String string) {
		if("Introduction".equals(string)){
			hp.Introduction_link.click();
		  }
		else if("Creating Linked List".equals(string)) {
			 hp.creatingLinkedList_link.click();
		  }
		else if("Types of Linked List".equals(string)) {
			hp. Typesoflinkedlist_link.click();
			}
		else if("Implement Linked List in Python".equals(string)){
			 hp.implementLinkedlistInPython_link.click();
			} 
		else if("Traversal".equals(string)) {
			hp.traversal_link.click();
		}
		else if("insertion-in-linked-list".equals(string)) {
			hp.insertionInLinkedlist_link.click();
		}
		else {
			hp.deletionInLinkedlist_link.click();
		}	 
	}

	@When("User clicks on Introduction link")
	public void user_clicks_on_introduction_link() {
	    hp.Introduction_link.click();
	}

	@When("User enters incorrect  code")
	public void user_enters_incorrect_code() {
		commonMethods.waitForElementToBeVisible(driver, hp.codeEditorPage);
		hp.codeEditorPage.click();
		commonMethods.actionsSendKeys(driver,hp.codeEditorPage,"print('Hello');;");
	}

	@Then("User must be able to see the alert message")
	public void user_must_be_able_to_see_the_alert_message() {
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		assertEquals(alertMessage,"SyntaxError: bad input on line 1");
	}

	@When("The user select Linkedlist from the drop down menu")
	public void the_user_select_linkedlist_from_the_drop_down_menu() {
		hp.dropdownMenu.click();
	}

	@When("The user clicks on the Linkedlist")
	public void the_user_clicks_on_the_linkedlist() {
		hp.Linkedlist.click();
	}

	@Then("The user should be navigated to the Linkedlist Page")
	public void the_user_should_be_navigated_to_the_linkedlist_page() {
		assertEquals(hp.LinkedListPage.getText(),"Linked List");
	}

	@When("User clicks on Linkedlist Introduction link")
	public void user_clicks_on_linkedlist_introduction_link() {
		hp.Introduction_link.click();
	}

	@When("User on the linkedlist Introduction Page and clicks on Practice Questions Link")
	public void user_on_the_linkedlist_introduction_page_and_clicks_on_practice_questions_link() {
		hp.practicequestionLink.click();
	}

	@Then("User must be redirected to Practice page for Linkedlist Introduction")
	public void user_must_be_redirected_to_practice_page_for_linkedlist_introduction() {
		assertNotEquals(hp.practiceQuestions_Text.getText(),"Practice Questions");
	}
	
}