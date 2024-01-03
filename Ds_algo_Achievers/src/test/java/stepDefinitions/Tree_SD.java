package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import Config.PropertiesFile;
import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.TreePage;
import utilities.commonMethods;

public class Tree_SD {
	
	TestContext testContext;
	WebDriver driver;
	TreePage tp;
	
	public Tree_SD(TestContext testContext) { 
		this.testContext = testContext;
		this.driver = testContext.getDriver();
		this.tp = testContext.getTp();
	}
	
	@When("User signs In to the application")
	public void user_is_on_the_sign_in_page() {
		tp.getStartedButtonHP.click();
		tp.signInLink.click();
		tp.username.sendKeys(PropertiesFile.readPropertiesFile("username"));
		tp.password.sendKeys(PropertiesFile.readPropertiesFile("password"));
		tp.loginButton.click();
	}
 
	@When("User clicks on Tree page - GetStarted button")
	public void user_clicks_on_tree_page_get_started_button() {
		tp.tree_getStarted.click();
	}

	@When("User clicks on Overview of Trees link")
	public void user_clicks_on_overview_of_trees_link() {
		tp.overview_Of_Trees.click();
	}

	@Then("The user should be directed to the Overview of Trees page")
	public void the_user_should_be_directed_to_the_overview_of_trees_page(){
		commonMethods.waitForElementToBeVisible(driver, tp.overview_Text);
		assertEquals(tp.overview_Text.getText(),"Overview of Trees");
	}

	@When("User clicks on Terminologies link")
	public void user_clicks_on_terminologies_link() {
//		tp.terminologies.click();
		commonMethods.actionsClick(tp.terminologies, driver);
	}

	@Then("The user should be directed to the Terminologies page")
	public void the_user_should_be_directed_to_the_terminologies_page() {
//		commonMethods.waitForElementToBeVisible(driver, tp.terminologies_Text);
		assertEquals(tp.terminologies_Text.getText(),"Terminologies");
	}

	@When("User clicks on Types of Trees link")
	public void user_clicks_on_types_of_trees_link() {
		tp.types_of_Trees.click();
//		commonMethods.actionsClick(tp.types_of_Trees, driver);
	}

	@Then("The user should be directed to the Types of Trees page")
	public void the_user_should_be_directed_to_the_types_of_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.typesOfTree_Text);
		assertEquals(tp.typesOfTree_Text.getText(),"Types of Trees");
		
	}

	@When("User clicks on Tree Traversals link")
	public void user_clicks_on_tree_traversals_link() {
		tp.tree_Traversals.click();
//		commonMethods.actionsClick(tp.tree_Traversals, driver);
	}

	@Then("The user should be directed to the Tree Traversals page")
	public void the_user_should_be_directed_to_the_tree_traversals_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.treeTraversals_Text);
		assertEquals(tp.treeTraversals_Text.getText(),"Tree Traversals");
	}

	@When("User clicks on Traversals-illustration link")
	public void user_clicks_on_traversals_illustration_link() {
		tp.traversals_Illustration.click();
//		commonMethods.actionsClick(tp.traversals_Illustration, driver);
	}

	@Then("The user should be directed to the Traversals-illustration page")
	public void the_user_should_be_directed_to_the_traversals_illustration_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.traversalsIllustration_Text);
		assertEquals(tp.traversalsIllustration_Text.getText(),"Traversals-Illustration");
	}

	@When("User clicks on Binary Trees link")
	public void user_clicks_on_binary_trees_link() {
		tp.binary_Trees.click();
//		commonMethods.actionsClick(tp.binary_Trees, driver);
	}

	@Then("The user should be directed to the Binary Trees page")
	public void the_user_should_be_directed_to_the_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.binaryTrees_Text);
		assertEquals(tp.binaryTrees_Text.getText(),"Binary Trees");
	}

	@When("User clicks on Types of Binary Trees link")
	public void user_clicks_on_types_of_binary_trees_link() {
		tp.types_of_Binary_Trees.click();
//		commonMethods.actionsClick(tp.binary_Trees, driver);
	}

	@Then("The user should be directed to the Types of Binary Trees page")
	public void the_user_should_be_directed_to_the_types_of_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.typesOfBinaryTrees_Text);
		assertEquals(tp.typesOfBinaryTrees_Text.getText(),"Types of Binary Trees");
	}

	@When("User clicks on Implementtion in Python link")
	public void user_clicks_on_implementtion_in_python_link() {
		tp.implementation_in_Python.click();
//		commonMethods.actionsClick(tp.implementation_in_Python, driver);
	}

	@Then("The user should be directed to the Implementtion in Python page")
	public void the_user_should_be_directed_to_the_implementtion_in_python_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.implementationInPython_Text);
		assertEquals(tp.implementationInPython_Text.getText(),"Implementation in Python");
		
	}

	@When("User clicks on Binary Tree Traversals link")
	public void user_clicks_on_binary_tree_traversals_link() {
		tp.binary_Tree_Traversals.click();
//		commonMethods.actionsClick(tp.binary_Tree_Traversals, driver);
	}

	@Then("The user should be directed to the Binary Tree Traversals page")
	public void the_user_should_be_directed_to_the_binary_tree_traversals_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.binaryTreeTraversals_Text);
		assertEquals(tp.binaryTreeTraversals_Text.getText(),"Binary Tree Traversals");
	}

	@When("User clicks on Implementation of Binary Trees link")
	public void user_clicks_on_implementation_of_binary_trees_link() {
		tp.implementation_of_Binary_Trees.click();
//		commonMethods.actionsClick(tp.implementation_of_Binary_Trees, driver);
	}

	@Then("The user should be directed to the Implementation of Binary Trees page")
	public void the_user_should_be_directed_to_the_implementation_of_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.implementationOfBinaryTrees_Text);
		assertEquals(tp.implementationOfBinaryTrees_Text.getText(),"Implementation of Binary Trees");
	}

	@When("User clicks on Applications of Binary Trees link")
	public void user_clicks_on_applications_of_binary_trees_link() {
		tp.applications_of_Binary_trees.click();
//		commonMethods.actionsClick(tp.applications_of_Binary_trees, driver);
	}

	@Then("The user should be directed to the Applications of Binary Trees page")
	public void the_user_should_be_directed_to_the_applications_of_binary_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.applicationsOfBinaryTrees_Text);
		assertEquals(tp.applicationsOfBinaryTrees_Text.getText(),"Applications of Binary trees");
	}

	@When("User clicks on Binary Search Trees link")
	public void user_clicks_on_binary_search_trees_link() {
		tp.Binary_Search_Trees.click();
//		commonMethods.actionsClick(tp.Binary_Search_Trees, driver);
	}

	@Then("The user should be directed to the Binary Search Trees page")
	public void the_user_should_be_directed_to_the_binary_search_trees_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.BinarySearchTrees_Text);
		assertEquals(tp.BinarySearchTrees_Text.getText(),"Binary Search Trees");
	}

	@When("User clicks on Implementation of BST link")
	public void user_clicks_on_implementation_of_bst_link() {
		tp.implementation_Of_BST.click();
//		commonMethods.actionsClick(tp.implementation_Of_BST, driver);
	}

	@Then("The user should be directed to the Implementation of BST page")
	public void the_user_should_be_directed_to_the_implementation_of_bst_page() {
		commonMethods.waitForElementToBeVisible(driver, tp.implementationOfBST_Text);
		assertEquals(tp.implementationOfBST_Text.getText(),"Implementation Of BST");
	}

	@When("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		tp.tryHereButton.click();
//		commonMethods.actionsClick(tp.tryHereButton, driver);
		
	}
	
	@Then("User should be redirected to Try Editor Page")
	public void user_should_be_redirected_to_try_editor_page() {
		assertTrue(driver.getPageSource().contains("Run"));
	}
	
	@When("User enters python code with syntax errors")
	public void user_enters_python_code_with_syntax_errors() {
		commonMethods.waitForElementToBeVisible(driver,tp.pythonCode_Input );
		commonMethods.actionsSendKeys(driver,tp.pythonCode_Input,"Hello'");
	}

	@Then("User must be able to see the syntax error alert")
	public void user_must_be_able_to_see_the_syntax_error_alert() {
		String alertMessage = driver.switchTo().alert().getText() ;
//		System.out.println(alertMessage);
		assertEquals(alertMessage ,"SyntaxError: bad input on line 1");
	}

	@When("User enters correct python code")
	public void user_enters_correct_python_code() {
		commonMethods.waitForElementToBeVisible(driver,tp.pythonCode_Input );
		commonMethods.actionsSendKeys(driver,tp.pythonCode_Input,"print('Hello')");
	}

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		tp.runButton.click();
	}

	@Then("User must be able to see the program output below the Run button")
	public void user_must_be_able_to_see_the_program_output_below_the_run_button() {
		commonMethods.waitForElementToBeVisible(driver,tp.pythonCode_Output);
		assertEquals(tp.pythonCode_Output.getText(),"Hello");
	}
	
	@When("User clicks on Data Structures drop down")
	public void user_clicks_on_data_structures_drop_down() {
		tp.dsDropDown.click();
	}

	@When("User clicks on Tree option")
	public void user_clicks_on_tree_option() {
		tp.tree_Option_DropDown.click();
	}

	@Then("User should be redirected to Tree page")
	public void user_should_be_redirected_to_tree_page() {
		assertEquals(tp.treePage_Text.getText(),"Tree");
	}
	
	@When("User clicks on Practice Questions Link")
	public void user_clicks_on_practice_questions_link() {
//		tp.practice_Questions.click();
		commonMethods.actionsClick(tp.practice_Questions, driver);
	}

	@Then("User must be redirected to Practice page")
	public void user_must_be_redirected_to_practice_page() {
		assertNotEquals(tp.practiceQuestions_Text.getText(),"Practice Questions");
	}
	
}
