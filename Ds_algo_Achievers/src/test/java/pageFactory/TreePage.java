package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {
	
	@FindBy(linkText = "Sign in") public WebElement signInLink;
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
	@FindBy(linkText = "Data Structures") public  WebElement dsDropDown;
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
	
	public TreePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}

}
