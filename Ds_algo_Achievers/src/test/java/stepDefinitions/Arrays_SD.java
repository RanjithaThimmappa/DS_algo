package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.PropertiesFile;
import context.Testcontext;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pageFactory.HomePage;
import utilities.commonMethods;
 
public class Arrays_SD {
	
	//WebDriver driver = DriverFactory.initializeDriver("Chrome");
	//DataStructureMainPage Dp=new DataStructureMainPage(driver);
	//ArrayPage Ap=new ArrayPage(driver);
	//ArrayTopicsPage Apl=new ArrayTopicsPage(driver);
	
	Testcontext testContext;
	HomePage hp;
	WebDriver driver;
	
	public Arrays_SD(Testcontext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	}
	
	//@Given("User in the Signin page")
	//public void user_in_the_signin_page() {
		//driver.get("https://dsportalapp.herokuapp.com/login");
		//String url = PropertiesFile.readPropertiesFile("HomePageUrl");
		//driver.get(url);
	//}

	//@When("The User login with valid credentials and redirected to Datastructure homepage")
	//public void the_user_login_with_valid_credentials_and_redirected_to_datastructure_homepage() {
		//WebElement username = driver.findElement(By.name("username"));
		//username.sendKeys("Achievers");
		//WebElement password = driver.findElement(By.name("password"));
	    //password.sendKeys("34dfSnRzx@QaRH");
	    
	    //WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
        //loginButton.click();
		//hp.getStartedButtonHP.click();
		//hp.signInLink.click();
		//hp.username.sendKeys(PropertiesFile.readPropertiesFile("username"));
		//hp.password.sendKeys(PropertiesFile.readPropertiesFile("password"));
		//hp.loginButton.click(); 
	//}
	
	@Given("User enters homepage url")
	public void user_enters_homepage_url() {
		String url = PropertiesFile.readPropertiesFile("HomePageUrl");
		driver.get(url);
	}
	
	@When("User signs In to the application")
	public void user_is_on_the_sign_in_page() {
		hp.getStartedButtonHP.click();
		hp.signInLink.click();
		hp.username.sendKeys(PropertiesFile.readPropertiesFile("username"));
		hp.password.sendKeys(PropertiesFile.readPropertiesFile("password"));
		hp.loginButton.click();
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

	//@When("The User clicks on Try Here on {string} Page")
	//public void the_user_clicks_on_try_here_on_page(String string) {
		//hp.tryhereBtn.click();
	//}
	
	@When("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		hp.tryhereBtn.click();
	}

	//@When("The User write a python code for {string} topic in the editor and click on Run button")
	//public void the_user_write_a_python_code_for_topic_in_the_editor_and_click_on_run_button(String string) {
		//WebElement codeEditor = driver.findElement(By.xpath("//form[@id='answer_form' ]"));
		//commonMethods.waitForElementToBeVisible(driver, codeEditor);
		//codeEditor.click();
		
		//commonMethods.actionsSendKeys(driver,codeEditor,"print('Hello')");
		//WebElement runBtn = driver.findElement(By.xpath("//button[@type='button' and @onclick='runit()']"));
		//runBtn.click();
    //}
	
	@When("User enters correct python code")
	public void user_enters_correct_python_code() {
		WebElement codeEditor = driver.findElement(By.xpath("//form[@id='answer_form' ]"));
		commonMethods.waitForElementToBeVisible(driver, codeEditor);
		codeEditor.click();
		commonMethods.actionsSendKeys(driver,codeEditor,"print('Hello')");
	}
	
	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		WebElement runBtn = driver.findElement(By.xpath("//button[@type='button' and @onclick='runit()']"));
		runBtn.click();
	}

	//@Then("Python code output for {string} topic should be displayed")
	//public void python_code_output_for_topic_should_be_displayed(String string) {
		//WebElement output = driver.findElement(By.id("output"));
		//assertEquals(output.getText(),"Hello");
	//}
	
	@Then("User must be able to see the program output below the Run button")
	public void user_must_be_able_to_see_the_program_output_below_the_run_button() {
		WebElement output = driver.findElement(By.id("output"));
		assertEquals(output.getText(),"Hello");
	}
	
	@When("The user select Arrays from the drop down menu")
	public void the_user_select_arrays_from_the_drop_down_menu() {
	    hp.dropdownMenu.click();
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

	@When("User clicks on Practice Questions Link")
	public void user_clicks_on_practice_questions_link() {
		hp.practicequestionLink.click();
	}

	@Then("User must be redirected to Practice page")
	public void user_must_be_redirected_to_practice_page() {
		assertEquals(hp.PracticequestionPage.getText(),"Search the array");
	}
	
	
}
	 