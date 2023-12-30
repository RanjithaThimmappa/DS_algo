package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import context.TestContext;
import io.cucumber.java.en.*;
import pageFactory.ArrayPage;
 
public class Arrays_SD{
	
	TestContext testContext;
	WebDriver driver;
	ArrayPage ap;
	
	public Arrays_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.ap = testContext.getAp();
	}

	@When("Click on the Get Started button for Array  Datastructures")
	public void click_on_the_get_started_button_for_array_datastructures() {
	    ap.getStartedButton_ArrayModule.click();
	}

	@When("The User clicks on {string} link")
	public void the_user_clicks_on_link(String string) {
		if ("Arrays in Python".equals(string)) {
		    ap.arrayinpythonLink.click();
		} else if ("Arrays Using List".equals(string)) {
			ap.arrayusinglistLink.click();
		} else if ("Basic Operations in Lists".equals(string)) {
			ap.basicoperationsinlistsLink.click();
		} else {
			ap.applicationofarraysLink.click();
		}
	}

	@When("The user select Arrays from the drop down menu")
	public void the_user_select_arrays_from_the_drop_down_menu() {
	    ap.dsDropDown.click();
	    ap.arrayDropDownElement.click();
	}

	@Then("The user should be navigated to the Array Page")
	public void the_user_should_be_navigated_to_the_array_page() {
		assertEquals(ap.arrayPage.getText(),"Array");
	}
	@When("User clicks on {string}  link")
	public void user_clicks_on_link(String string) {
		if ("Arrays in Python".equals(string)) {
		    ap.arrayinpythonLink.click();
		} else if ("Arrays Using List".equals(string)) {
			ap.arrayusinglistLink.click();
		} else if ("Basic Operations in Lists".equals(string)) {
			ap.basicoperationsinlistsLink.click();
		} else {
			ap.applicationofarraysLink.click();
		}
	}

}
	 