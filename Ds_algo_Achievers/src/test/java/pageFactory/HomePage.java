package pageFactory;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.commonMethods;

public class HomePage {
	
//	Home page elements:
	@FindBy(xpath = "//h1[text()='Preparing for the Interviews']") public  WebElement homePageText;
	@FindBy(xpath = "//button[text()='Get Started']") public  WebElement getStartedButtonHP;
	@FindBy(linkText = "Data Structures") public  WebElement dsDropDown;
	@FindBy(xpath = "//a[@class='dropdown-item']") public  List<WebElement> dsDropDownOptions;
	@FindBy(xpath = "//a[text()=' Register ']") public  WebElement registerLink;
	@FindBy(xpath = "//a[text()='Sign in']") public  WebElement signInLink;
	@FindBy(xpath = "//input[@value='Register']") public  WebElement registerButton;
	@FindBy(xpath = "//*[@class='card-title']") public  List<WebElement> dsModuleTitles;
	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']") public  WebElement getStartedButton_DSIntroductionModule;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public  WebElement notLoggedInAlert;
	@FindBy(name = "username") public  WebElement userName_SignIn;
	@FindBy(name = "password") public  WebElement passWord_SignIn;
	@FindBy(linkText = "Register!") public  WebElement pleaseRegisterMessageLink;

//	Register page elements:
	@FindBy(name = "username") public WebElement username_Register;
	@FindBy(name = "password1") public WebElement password_Register;
	@FindBy(name = "password2") public WebElement confirmPassword_Register;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public WebElement errorMessage_Register;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public WebElement success_Register;

//  Tree page elements:
	@FindBy(name = "username") public WebElement username;
	@FindBy(name = "password") public WebElement password;
	@FindBy(xpath = "//input[@value='Login']") public WebElement loginButton;
	@FindBy(xpath = "//a[@href='tree']") public WebElement tree_getStarted;
	@FindBy(linkText = "Overview of Trees") public WebElement overview_Of_Trees;
	@FindBy(linkText = "Terminologies") public WebElement terminologies;
	@FindBy(linkText = "Types of Trees") public WebElement types_of_Trees;
	@FindBy(linkText = "Tree Traversals") public WebElement tree_Traversals;
	@FindBy(linkText = "Traversals-Illustration") public WebElement traversals_Illustration;
	@FindBy(linkText = "Binary Trees") public WebElement binary_Trees;
	@FindBy(linkText = "Types of Binary Trees") public WebElement types_of_Binary_Trees;
	@FindBy(linkText = "Implementation in Python") public WebElement implementation_in_Python;
	@FindBy(linkText = "Binary Tree Traversals") public WebElement binary_Tree_Traversals;
	@FindBy(linkText = "Implementation of Binary Trees") public WebElement implementation_of_Binary_Trees;
	@FindBy(linkText = "Applications of Binary trees") public WebElement applications_of_Binary_trees;
	@FindBy(linkText = "Binary Search Trees") public WebElement Binary_Search_Trees;
	@FindBy(linkText = "Implementation Of BST") public WebElement implementation_Of_BST;
	@FindBy(linkText = "Tree") public  WebElement tree_Option_DropDown;
	@FindBy(linkText = "Try here>>>") public  WebElement tryHereButton;
	@FindBy(xpath = "//*[@id='answer_form']") public  WebElement pythonCode_Input;
	@FindBy(xpath = "//button[text()='Run']") public  WebElement runButton;
	@FindBy(id = "output") public  WebElement pythonCode_Output;
	@FindBy(xpath = "//p[text()='Overview of Trees']") public  WebElement overview_Text;
	@FindBy(xpath = "//p[text()='Terminologies']") public  WebElement terminologies_Text;
	@FindBy(xpath = "//p[text()='Types of Trees']") public  WebElement typesOfTree_Text;
	@FindBy(xpath = "//p[text()='Tree Traversals']") public  WebElement treeTraversals_Text;
	@FindBy(xpath = "//p[text()='Traversals-Illustration']") public  WebElement traversalsIllustration_Text;
	@FindBy(xpath = "//p[text()='Binary Trees']") public  WebElement binaryTrees_Text;
	@FindBy(xpath = "//p[text()='Types of Binary Trees']") public  WebElement typesOfBinaryTrees_Text;
	@FindBy(xpath = "//p[text()='Implementation in Python']") public  WebElement implementationInPython_Text;
	@FindBy(xpath = "//p[text()='Binary Tree Traversals']") public  WebElement binaryTreeTraversals_Text;
	@FindBy(xpath = "//p[text()='Implementation of Binary Trees']") public  WebElement implementationOfBinaryTrees_Text;
	@FindBy(xpath = "//p[text()='Applications of Binary trees']") public  WebElement applicationsOfBinaryTrees_Text;
	@FindBy(xpath = "//p[text()='Binary Search Trees']") public  WebElement BinarySearchTrees_Text;
	@FindBy(xpath = "//p[text()='Implementation Of BST']") public  WebElement implementationOfBST_Text;
	@FindBy(linkText = "Practice Questions") public  WebElement practice_Questions;
	@FindBy(xpath = "//body") public  WebElement practiceQuestions_Text;
	@FindBy(xpath = "//h4[text()='Tree']") public  WebElement treePage_Text;

//  Graph Page elements:
	@FindBy(xpath = "//a[@href='graph']") public WebElement graph_getStarted;
	@FindBy(linkText = "Graph") public WebElement graphLink;
	@FindBy(linkText = "Graph Representations") public WebElement graphRepresentationsLink;
	@FindBy(xpath = "//strong//p[text()='Graph']") public WebElement graphLinkPage_Text;
	@FindBy(xpath = "//p[text()='Graph Representations']") public WebElement graphRepresentations_Text;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Graph']") public WebElement graphOption_DSDropdown;
	@FindBy(xpath = "//h4[text()='Graph']") public WebElement graphPage_Text;
	
	public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);

    }
	
}
