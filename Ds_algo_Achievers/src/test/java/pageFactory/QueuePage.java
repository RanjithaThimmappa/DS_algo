package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	
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
	
	public QueuePage(WebDriver driver){
		
        PageFactory.initElements(driver, this);

    }

}
