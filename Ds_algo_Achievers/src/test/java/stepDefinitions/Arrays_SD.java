package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pageFactory.HomePage;
import utilities.commonMethods;
 
public class Arrays_SD {
	
	TestContext testContext;
	HomePage hp;
	WebDriver driver;
	
	public Arrays_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	}

	@When("Click on the Get Started button for Array  Datastructures")
	public void click_on_the_get_started_button_for_array_datastructures() {
	    hp.getStartedButton_ArrayModule.click();
	}

	@When("The User clicks on {string} link")
	public void the_user_clicks_on_link(String string) {
		if ("Arrays in Python".equals(string)) {
		    hp.arrayinpythonLink.click();
		} else if ("Arrays Using List".equals(string)) {
			hp.arrayusinglistLink.click();
		} else if ("Basic Operations in Lists".equals(string)) {
			hp.basicoperationsinlistsLink.click();
		} else {
			hp.applicationofarraysLink.click();
		}
	}

	@When("The user select Arrays from the drop down menu")
	public void the_user_select_arrays_from_the_drop_down_menu() {
	    hp.dsDropDown.click();
	    hp.arrayDropDownElement.click();
	}

	@Then("The user should be navigated to the Array Page")
	public void the_user_should_be_navigated_to_the_array_page() {
		assertEquals(hp.arrayPage.getText(),"Array");
	}
	@When("User clicks on {string}  link")
	public void user_clicks_on_link(String string) {
		if ("Arrays in Python".equals(string)) {
		    hp.arrayinpythonLink.click();
		} else if ("Arrays Using List".equals(string)) {
			hp.arrayusinglistLink.click();
		} else if ("Basic Operations in Lists".equals(string)) {
			hp.basicoperationsinlistsLink.click();
		} else {
			hp.applicationofarraysLink.click();
		}
	}

}
	 