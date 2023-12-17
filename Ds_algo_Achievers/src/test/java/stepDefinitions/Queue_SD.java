package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import configuration.PropertiesFile;
import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageFactory.HomePage;
import pageFactory.Queue;

import utilities.DriverFactory;
import utilities.commonMethods;


public class Queue_SD {
    

	TestContext testContext;
	HomePage hp;
	WebDriver driver;
	
	public Queue_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	}	



@When("The user clicks GetStarted button below the Queue")
public void the_user_clicks_get_started_button_below_the_queue() {
	hp.GetStartedBtn.click();
	Assert.assertEquals(hp.QueueText.getText(), "Queue");
	
}

@When("The user clicks the Implementation of Queue in Python link")
public void the_user_clicks_the_implementation_of_queue_in_python_link() {
	commonMethods.actionsClick(hp.ImplemntatnOfQueInPythn_Link, driver);
}

@Then("The user should be directed to the Implementation of Queue in Python page")
public void the_user_should_be_directed_to_the_implementation_of_queue_in_python_page() {
	commonMethods.waitForElementToBeClickable(driver, hp.ImplemntatnOfQueInPythn_Text);
	Assert.assertEquals(hp.ImplemntatnOfQueInPythn_Text.getText(), "Implementation of Queue in Python");
}




@When("The user clicks the Implementation using collections.deque link")
public void the_user_clicks_the_implementation_using_collections_deque_link() {
	commonMethods.waitForElementToBeClickable(driver, hp.ImplemntatnCollectn_Link);
	commonMethods.actionsClick(hp.ImplemntatnCollectn_Link, driver);
	
}

@Then("The user should be directed to the Implementation using collections.deque page")
public void the_user_should_be_directed_to_the_implementation_using_collections_deque_page() {
	Assert.assertEquals(hp.ImplemntatnCollectn_Text.getText(), "Implementation using collections.deque");
}

@When("The user clicks the Implementation using array link")
public void the_user_clicks_the_implementation_using_array_link() {
	commonMethods.waitForElementToBeClickable(driver, hp.ImplemnatatnUsingArray_Link);
	commonMethods.actionsClick(hp.ImplemnatatnUsingArray_Link, driver);
}


@Then("The user should be directed to the Implementation using array page")
public void the_user_should_be_directed_to_the_implementation_using_array_page() {
	Assert.assertEquals(hp.ImplemnatatnUsingArray_Text.getText(),"Implementation using array");
	
}
@When("The user clicks the Queue Operations link")
public void the_user_clicks_the_queue_operations_link() {
	commonMethods.waitForElementToBeClickable(driver, hp.QueueOperatn_Link);
	commonMethods.actionsClick(hp.QueueOperatn_Link, driver);
	
	
}

@Then("The user should be directed to the Queue Operations page")
public void the_user_should_be_directed_to_the_queue_operations_page() {
	Assert.assertTrue(hp.QueueOperatn_Text.isDisplayed());
	
}

//@When("The user Clicks the Try here button")
//public void the_user_clicks_the_try_here_button() {
//	commonMethods.actionsClick(hp.TryHereBtn, driver);
//	//que.TryHereBtn.click();
//}

@Then("The user should be directed to the TryEditor Page")
public void the_user_directed_to_the_try_editot_page() {
	Assert.assertEquals(hp.runbtn.getText(), "Run");

}
@When("The user enter the python script")
public void the_user_enter_the_python_script() {
	commonMethods.waitForElementToBeClickable(driver,hp.Input_PythonCode);
	commonMethods.actionsSendKeys(hp.Input_PythonCode, driver, "print(1)");
}

//@When("The user clicks the runbutton")
//public void The_user_clicks_the_runbutton() {
//	commonMethods.actionsClick(hp.runbtn, driver);
//	
//}
@Then("The user is able to see the output of the code")
public void the_user_is_able_to_see_the_output() {
	Assert.assertTrue(hp.PythonCode_Output.isDisplayed());

}


@When("The user enters the wrong python script")
public void the_user_enters_the_wrong_python_script() {
	commonMethods.waitForElementToBeClickable(driver, hp.Input_PythonCode);
	commonMethods.actionsSendKeys(hp.Input_PythonCode, driver, "hello");
}

@Then("The user is able to see the errormessage in the page")
public void the_user_is_able_to_see_the_errormessage_in_the_page() {
	
	driver.switchTo().alert().accept();
	
}

@When("The user clicks the practice Question link")
public void the_user_clicks_the_practice_question_link() {
	commonMethods.actionsClick(hp.practiceQuestion_Link, driver);
	
}

@Then("The user should be directed to the Practice Question Page")
public void the_user_should_be_directed_to_the_practice_question_page() {
	Assert.assertTrue(hp.practiceQuestion_page.isDisplayed());
}



@When("The user clicks the practice Questions link")
public void the_user_clicks_the_practice_questions_link() {
	commonMethods.actionsClick(hp.practiceQuestion_Link, driver);

}

@When("The user should be directed to the practice Questions page")
public void the_user_should_be_directed_to_the_practice_questions_page() {

	Assert.assertTrue(hp.practiceQuestion_page.isDisplayed());
}


@When("The user clicks the link Implementation using collections.deque")
public void the_user_clicks_the_link_implementation_using_collections_deque() {
	commonMethods.actionsClick(hp.ImplementationColectn_Deque, driver);
}

@When("The user redircted to the page Implementation using collections.deque")
public void the_user_redircted_to_the_page_implementation_using_collections_deque() {
	hp.ImplementationColectn_Deque.isDisplayed();
}

@When("The user clicks the link Implementation using array")
public void the_user_clicks_the_link_implementation_using_array() {
	commonMethods.actionsClick(hp.Implemenetaion_Using_ArrayLink2, driver);
}

@When("The user redircted to the page Implementation using array")
public void the_user_redircted_to_the_page_implementation_using_array() {
	hp.Implemenetaion_Using_ArrayLink2.isDisplayed();
}

@When("The user clicks the link Queue Operations")
public void the_user_clicks_the_link_queue_operations() {
	commonMethods.actionsClick(hp.QueueOperatn_Link2, driver);
}

@When("The user redircted to the page Queue Operations")
public void the_user_redircted_to_the_page_queue_operations() {
	hp.QueueOperatn_Link2.isDisplayed();
}

@When("The user clicks the link practice Questions")
public void the_user_clicks_the_link_practice_questions() {
	commonMethods.actionsClick(hp.practiceQuestion_Link, driver);
}

@When("The user redircted to the page practice Questions")
public void the_user_redircted_to_the_page_practice_questions() {
	hp.practiceQuestion_page.isDisplayed();
}






@After 
public void CloseWindow() {
	//driver.close();
	driver.quit();
}

}