package pageFactory;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.commonMethods;

public class HomePage {
	
	WebDriver driver;
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

//  Sign-in Page elements:
	@FindBy(xpath = "//button[text()='Get Started']") public  WebElement getStartedButton;
	@FindBy(xpath = "//a[text()='Sign in']") public  WebElement signIn;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public  WebElement signInText;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public  WebElement inValidText;
	
//  Sign-out page element:
	@FindBy(xpath = "//input[@value='Login']")public WebElement login;
	@FindBy(xpath = "//a[text()='Sign out']")public WebElement signOutLink;
	@FindBy(xpath = "/html/body/div[2]")public WebElement loggedOutText;

// DataStructures page elements:
	@FindBy(xpath="//a[@href=\"data-structures-introduction\"]") public WebElement getStartedBtn;
	@FindBy(xpath="//h4[text()='Data Structures-Introduction']") public WebElement dataStructureText;
	@FindBy(xpath="//a[@href='time-complexity']")public WebElement timeComplexityBtn;
	@FindBy(xpath="//p[text()='Time Complexity']") public WebElement timeComplexityText;
	@FindBy(xpath="//a[text()='Try here>>>']") public WebElement tryHereBtn;
	@FindBy(xpath="//form[@id='answer_form']") public WebElement InputText;
	@FindBy(xpath="//button[@type='button']")public WebElement RunBtn;
//	@FindBy(xpath="//*[@id='output']") public WebElement output;
	@FindBy(xpath="//a[@href='/data-structures-introduction/practice']") public WebElement practiceQuestionLink;
	@FindBy(xpath="/html/body")public WebElement PractceQuestion_page;
	
//  Queue page elements:
	@FindBy(xpath="//a[@href='/login']")       public WebElement SignInBtn;
	@FindBy(xpath="//input[@name='username']") public WebElement userName;
	@FindBy(xpath="//input[@name='password']") public WebElement passWord;
	@FindBy(xpath="//input[@value='Login']")   public WebElement loginBtn;
	@FindBy(xpath="//a[@href='/logout']")      public WebElement SignOutBtn;
	@FindBy(xpath="//a[@href='queue']") public WebElement GetStartedBtn;
	@FindBy(xpath="//h4[text()='Queue']")public WebElement QueueText;
	@FindBy(xpath="//a[@href='implementation-lists']")public WebElement ImplemntatnOfQueInPythn_Link;
	@FindBy(xpath="//p[text()='Implementation of Queue in Python']")public WebElement ImplemntatnOfQueInPythn_Text;
	@FindBy(xpath="//a[@href='implementation-collections']")public WebElement ImplemntatnCollectn_Link;
	@FindBy(xpath="//p[text()='Implementation using collections.deque']") public WebElement ImplemntatnCollectn_Text;
	@FindBy(xpath="//a[@href='/queue/implementation-collections/']")public WebElement ImplementationColectn_Deque;
	@FindBy(xpath="//a[@href='Implementation-array']")public WebElement ImplemnatatnUsingArray_Link;
	@FindBy(xpath="//p[text()='Implementation using array']")public WebElement ImplemnatatnUsingArray_Text;
	@FindBy(xpath="//a[@href='/queue/Implementation-array/']")public WebElement Implemenetaion_Using_ArrayLink2;
	@FindBy(xpath="//a[@href='QueueOp']") public WebElement QueueOperatn_Link;
	@FindBy(xpath="//p[text()='Queue Operations']") public WebElement QueueOperatn_Text;
	@FindBy(xpath="//a[@href='/queue/QueueOp/']") public WebElement QueueOperatn_Link2;
	@FindBy(xpath="//a[@href='/tryEditor']")public WebElement TryHereBtn;
	@FindBy(xpath="//*[@id='answer_form']") public WebElement Input_PythonCode;
	@FindBy(xpath="//button[text()='Run']")public WebElement runbtn;
	@FindBy(xpath="//*[@id='output']")public WebElement PythonCode_Output;
	@FindBy(xpath="//a[@href='/queue/practice']") public WebElement practiceQuestion_Link;
	@FindBy(xpath="/html/body") public WebElement practiceQuestion_page;
	
//  Stack page elements:
	@FindBy(css="h5.card-title")List<WebElement> datastructures;
	@FindBy(xpath="//h4[text()='Stack']")public WebElement stackpage;
	@FindBy(xpath="//a[text()='Operations in Stack']")public WebElement Operations_in_Stack;
	@FindBy(xpath="//a[text()='Implementation']")public WebElement Implementation;
	@FindBy(xpath="//a[text()='Applications']")public WebElement Applications;
	@FindBy(xpath="//a[text()='Try here>>>']")public WebElement tryHere;
	@FindBy(xpath = "//*[@id='answer_form']") public  WebElement pythonCode;
	@FindBy(xpath = "//button[text()='Run']") public  WebElement Run;
	@FindBy(id = "output") public  WebElement Output;
	@FindBy(xpath = "//body") public  WebElement practiceQn;
	@FindBy(linkText = "Data Structures") public  WebElement DropDown;
	@FindBy(linkText = "Stack") public  WebElement stack_DropDown;
	@FindBy(xpath = "//h4[text()='Stack']") public  WebElement stack_Text;
	
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
	
//  Array Page elements:	
	@FindBy(xpath = "//h4[text() = 'Array']") public WebElement arrayPage;
	@FindBy(xpath = "//a[@href='arrays-in-python']") public  WebElement arrayinpythonLink;
	@FindBy(xpath = "//a[text()='Arrays Using List']") public  WebElement arrayusinglistLink;
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']") public  WebElement basicoperationsinlistsLink;
	@FindBy(xpath = "//a[text()='Applications of Array']") public  WebElement applicationofarraysLink;
	@FindBy(xpath =  "//a[text()='Search the array']")    public WebElement PracticequestionPage;
	@FindBy(xpath = "//h5[text()='Array']/../a[text() = 'Get Started']") public  WebElement getStartedButton_ArrayModule;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Arrays']") public WebElement arrayDropDownElement;
	
// Linked-List Page elements:
	@FindBy(name="username") public WebElement Username;
	@FindBy(name="password") public WebElement Password;
	@FindBy(xpath = "//a[@href='linked-list']") public  WebElement getStartedButton_LinkedlistModule;
	@FindBy(xpath="//a[@href='introduction']")public WebElement Introduction_link;
	@FindBy(xpath="//a[@href='creating-linked-list']") public WebElement creatingLinkedList_link;
	@FindBy(xpath="//a[text()='Types of Linked List']") public WebElement Typesoflinkedlist_link;
	@FindBy(xpath="//a[@href='implement-linked-list-in-python']") public WebElement implementLinkedlistInPython_link;
	@FindBy(xpath="//a[@href='traversal']") public WebElement traversal_link;
	@FindBy(xpath="//a[@href='insertion-in-linked-list']") public WebElement insertionInLinkedlist_link;
	@FindBy(xpath="//a[@href='deletion-in-linked-list']") public WebElement deletionInLinkedlist_link;
	@FindBy(xpath = "//a[@href='/tryEditor']") public  WebElement tryhereBtn;
	@FindBy(xpath = "//a[text()='Practice Questions']") public  WebElement practicequestionLink;
	@FindBy(xpath = "//div[@class ='input']") public  WebElement codeEditorPage;
	@FindBy(xpath = "//button[@type='button' and @onclick='runit()' and text()='Run']") public  WebElement runBtn;
	@FindBy(id="output") public WebElement output; 
	@FindBy(xpath="//a[text()='Data Structures']") public WebElement dropdown;
	@FindBy(xpath="//a[@class='dropdown-item' and  text()='Linked List']") public WebElement Linkedlist;
	@FindBy(xpath="//h4[text()='Linked List']") public WebElement LinkedListPage;
	@FindBy(xpath="//a[text()='Practice Questions']") public WebElement LLPracticeQuestionLink;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	public void WarningMessage()
	{
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}
	
	public boolean verifySignoutText()
	{
		try {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(signOutLink));
			return true;
		}catch(Exception e)
		{
			return false;
		}
	
	}
	
	public  void verifyGetStartedButton() throws InterruptedException
	{
		for(int i=0;i<datastructures.size();i++)
		{
			String dsname=datastructures.get(i).getText();
			driver.findElements(By.xpath("//a[text()='Get Started']")).get(i).click();
			Thread.sleep(1000);
			System.out.println("The " +dsname+" cannot be opened because "+loggedOutText.getText());
		
		}
	}
	
	public  void ClickonGetStartedButton() throws InterruptedException
	{
		for(int i=0;i<datastructures.size();i++)
		{
			String dsname=datastructures.get(i).getText();
			if(dsname.contains("Stack"))
			{
			driver.findElements(By.xpath("//a[text()='Get Started']")).get(i).click();
			break;
			}
		
		}
	}
	
	public void clearText()
	{
		Actions actions=new Actions(driver);
		actions.click(pythonCode).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
		.build().perform();
	}
	
}
