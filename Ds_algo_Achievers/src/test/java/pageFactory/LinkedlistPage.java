package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedlistPage {

	@FindBy(name="username") public WebElement Username;
	@FindBy(name="password") public WebElement Password;
	@FindBy(xpath="//input[@type='submit' and @value='Login']") public WebElement loginButton;
	@FindBy(xpath = "//a[@href='linked-list']") public  WebElement getStartedButton_LinkedlistModule;
	@FindBy(xpath="//a[@href='introduction']")public WebElement Introduction_link;
	@FindBy(xpath="//a[@href='creating-linked-list']") public WebElement creatingLinkedList_link;
	@FindBy(xpath="//a[@href='types-of-linked-list']") public WebElement Typesoflinkedlist_link;
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
	@FindBy(xpath = "//body") public  WebElement practiceQuestions_Text;
	@FindBy(linkText = "Data Structures") public  WebElement dsDropDown;


	public LinkedlistPage(WebDriver driver) {
	     
	      PageFactory.initElements(driver, this);
	}
}
