package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Config.PropertiesFile;
import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.GraphPage;
import pageFactory.HomePage;
import pageFactory.TreePage;
import utilities.commonMethods;

public class Tree_SD {
	
	TestContext testContext;
	HomePage hp;
	WebDriver driver;
	
	public Tree_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.hp = testContext.getHp();
	}
	
	@When("User signs In to the application")
	public void user_is_on_the_sign_in_page() {
		hp.getStartedButtonHP.click();
		hp.signInLink.click();
		hp.username.sendKeys(PropertiesFile.readPropertiesFile("username"));
		hp.password.sendKeys(PropertiesFile.readPropertiesFile("password"));
		hp.loginButton.click();
	}

	@When("User clicks on Tree page - GetStarted button")
	public void user_clicks_on_tree_page_get_started_button() {
		hp.tree_getStarted.click();
	}

	@When("User clicks on Overview of Trees link")
	public void user_clicks_on_overview_of_trees_link() {
		hp.overview_Of_Trees.click();
	}

	@Then("The user should be directed to the Overview of Trees page")
	public void the_user_should_be_directed_to_the_overview_of_trees_page(){
		commonMethods.waitForElementToBeVisible(driver, hp.overview_Text);
		assertEquals(hp.overview_Text.getText(),"Overview of Trees");
	}

	@When("User clicks on Terminologies link")
	public void user_clicks_on_terminologies_link() {
//		hp.terminologies.click();
		commonMethods.actionsClick(hp.terminologies, driver);
	}

	@Then("The user should be directed to the Terminologies page")
	public void the_user_should_be_directed_to_the_terminologies_page() {
//		commonMethods.waitForElementToBeVisible(driver, hp.terminologies_Text);
		assertEquals(hp.terminologies_Text.getText(),"Terminologies");
	}

	@When("User clicks on Types of Trees link")
	public void user_clicks_on_types_of_trees_link() {
		hp.types_of_Trees.click();
//		commonMethods.actionsClick(hp.types_of_Trees, driver);
	}

	@Then("The user should be directed to the Types of Trees page")
	public void the_user_should_be_directed_to_the_types_of_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.typesOfTree_Text);
		assertEquals(hp.typesOfTree_Text.getText(),"Types of Trees");
		
	}

	@When("User clicks on Tree Traversals link")
	public void user_clicks_on_tree_traversals_link() {
		hp.tree_Traversals.click();
//		commonMethods.actionsClick(hp.tree_Traversals, driver);
	}

	@Then("The user should be directed to the Tree Traversals page")
	public void the_user_should_be_directed_to_the_tree_traversals_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.treeTraversals_Text);
		assertEquals(hp.treeTraversals_Text.getText(),"Tree Traversals");
	}

	@When("User clicks on Traversals-illustration link")
	public void user_clicks_on_traversals_illustration_link() {
		hp.traversals_Illustration.click();
//		commonMethods.actionsClick(hp.traversals_Illustration, driver);
	}

	@Then("The user should be directed to the Traversals-illustration page")
	public void the_user_should_be_directed_to_the_traversals_illustration_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.traversalsIllustration_Text);
		assertEquals(hp.traversalsIllustration_Text.getText(),"Traversals-Illustration");
	}

	@When("User clicks on Binary Trees link")
	public void user_clicks_on_binary_trees_link() {
		hp.binary_Trees.click();
//		commonMethods.actionsClick(hp.binary_Trees, driver);
	}

	@Then("The user should be directed to the Binary Trees page")
	public void the_user_should_be_directed_to_the_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.binaryTrees_Text);
		assertEquals(hp.binaryTrees_Text.getText(),"Binary Trees");
	}

	@When("User clicks on Types of Binary Trees link")
	public void user_clicks_on_types_of_binary_trees_link() {
		hp.types_of_Binary_Trees.click();
//		commonMethods.actionsClick(hp.binary_Trees, driver);
	}

	@Then("The user should be directed to the Types of Binary Trees page")
	public void the_user_should_be_directed_to_the_types_of_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.typesOfBinaryTrees_Text);
		assertEquals(hp.typesOfBinaryTrees_Text.getText(),"Types of Binary Trees");
	}

	@When("User clicks on Implementtion in Python link")
	public void user_clicks_on_implementtion_in_python_link() {
		hp.implementation_in_Python.click();
//		commonMethods.actionsClick(hp.implementation_in_Python, driver);
	}

	@Then("The user should be directed to the Implementtion in Python page")
	public void the_user_should_be_directed_to_the_implementtion_in_python_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.implementationInPython_Text);
		assertEquals(hp.implementationInPython_Text.getText(),"Implementation in Python");
		
	}

	@When("User clicks on Binary Tree Traversals link")
	public void user_clicks_on_binary_tree_traversals_link() {
		hp.binary_Tree_Traversals.click();
//		commonMethods.actionsClick(hp.binary_Tree_Traversals, driver);
	}

	@Then("The user should be directed to the Binary Tree Traversals page")
	public void the_user_should_be_directed_to_the_binary_tree_traversals_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.binaryTreeTraversals_Text);
		assertEquals(hp.binaryTreeTraversals_Text.getText(),"Binary Tree Traversals");
	}

	@When("User clicks on Implementation of Binary Trees link")
	public void user_clicks_on_implementation_of_binary_trees_link() {
		hp.implementation_of_Binary_Trees.click();
//		commonMethods.actionsClick(hp.implementation_of_Binary_Trees, driver);
	}

	@Then("The user should be directed to the Implementation of Binary Trees page")
	public void the_user_should_be_directed_to_the_implementation_of_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.implementationOfBinaryTrees_Text);
		assertEquals(hp.implementationOfBinaryTrees_Text.getText(),"Implementation of Binary Trees");
	}

	@When("User clicks on Applications of Binary Trees link")
	public void user_clicks_on_applications_of_binary_trees_link() {
		hp.applications_of_Binary_trees.click();
//		commonMethods.actionsClick(hp.applications_of_Binary_trees, driver);
	}

	@Then("The user should be directed to the Applications of Binary Trees page")
	public void the_user_should_be_directed_to_the_applications_of_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.applicationsOfBinaryTrees_Text);
		assertEquals(hp.applicationsOfBinaryTrees_Text.getText(),"Applications of Binary trees");
	}

	@When("User clicks on Binary Search Trees link")
	public void user_clicks_on_binary_search_trees_link() {
		hp.Binary_Search_Trees.click();
//		commonMethods.actionsClick(hp.Binary_Search_Trees, driver);
	}

	@Then("The user should be directed to the Binary Search Trees page")
	public void the_user_should_be_directed_to_the_binary_search_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.BinarySearchTrees_Text);
		assertEquals(hp.BinarySearchTrees_Text.getText(),"Binary Search Trees");
	}

	@When("User clicks on Implementation of BST link")
	public void user_clicks_on_implementation_of_bst_link() {
		hp.implementation_Of_BST.click();
//		commonMethods.actionsClick(hp.implementation_Of_BST, driver);
	}

	@Then("The user should be directed to the Implementation of BST page")
	public void the_user_should_be_directed_to_the_implementation_of_bst_page() {
		commonMethods.waitForElementToBeVisible(driver, hp.implementationOfBST_Text);
		assertEquals(hp.implementationOfBST_Text.getText(),"Implementation Of BST");
	}

	@When("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		hp.tryHereButton.click();
//		commonMethods.actionsClick(hp.tryHereButton, driver);
		
	}
	
	@Then("User should be redirected to Try Editor Page")
	public void user_should_be_redirected_to_try_editor_page() {
		assertTrue(driver.getPageSource().contains("Run"));
	}
	
	@When("User enters python code with syntax errors")
	public void user_enters_python_code_with_syntax_errors() {
		commonMethods.waitForElementToBeVisible(driver,hp.pythonCode_Input );
		commonMethods.actionsSendKeys(driver,hp.pythonCode_Input,"Hello'");
	}

	@Then("User must be able to see the syntax error alert")
	public void user_must_be_able_to_see_the_syntax_error_alert() {
		String alertMessage = driver.switchTo().alert().getText() ;
//		System.out.println(alertMessage);
		assertEquals(alertMessage ,"SyntaxError: bad input on line 1");
	}

	@When("User enters correct python code")
	public void user_enters_correct_python_code() {
		commonMethods.waitForElementToBeVisible(driver,hp.pythonCode_Input );
		commonMethods.actionsSendKeys(driver,hp.pythonCode_Input,"print('Hello')");
	}

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		hp.runButton.click();
	}

	@Then("User must be able to see the program output below the Run button")
	public void user_must_be_able_to_see_the_program_output_below_the_run_button() {
		commonMethods.waitForElementToBeVisible(driver,hp.pythonCode_Output);
		assertEquals(hp.pythonCode_Output.getText(),"Hello");
	}
	
	@When("User clicks on Data Structures drop down")
	public void user_clicks_on_data_structures_drop_down() {
		hp.dsDropDown.click();
	}

	@When("User clicks on Tree option")
	public void user_clicks_on_tree_option() {
		hp.tree_Option_DropDown.click();
	}

	@Then("User should be redirected to Tree page")
	public void user_should_be_redirected_to_tree_page() {
		assertEquals(hp.treePage_Text.getText(),"Tree");
	}
	
	@When("User clicks on Practice Questions Link")
	public void user_clicks_on_practice_questions_link() {
//		hp.practice_Questions.click();
		commonMethods.actionsClick(hp.practice_Questions, driver);
	}

	@Then("User must be redirected to Practice page")
	public void user_must_be_redirected_to_practice_page() {
		assertNotEquals(hp.practiceQuestions_Text.getText(),"Practice Questions");
	}
	
}
