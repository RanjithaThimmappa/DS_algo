package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructure {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/login']")       public WebElement SignInBtn;
	@FindBy(xpath="//input[@name='username']") public WebElement username;
	@FindBy(xpath="//input[@name='password']") public WebElement password;
	@FindBy(xpath="//input[@value='Login']")   public WebElement loginBtn;
	@FindBy(xpath="//a[@href='/logout']")      public WebElement SignOutBtn;
	
	@FindBy(xpath="//a[@href=\"data-structures-introduction\"]") public WebElement getStartedBtn;
	@FindBy(xpath="//h4[text()='Data Structures-Introduction']") public WebElement dataStructureText;
	@FindBy(xpath="//a[@href='time-complexity']")public WebElement timeComplexityBtn;
	@FindBy(xpath="//p[text()='Time Complexity']") public WebElement timeComplexityText;
	@FindBy(xpath="//a[@class='btn btn-info']") public WebElement tryHereBtn;
	@FindBy(xpath="//pre[@class=' CodeMirror-line ']") public WebElement textEditorSpace;
	@FindBy(xpath="//button[@type='button']")public WebElement RunBtn;
	@FindBy(xpath="//a[@href='/data-structures-introduction/practice']") public WebElement practiceQuestionBtn;
	
	public DataStructure(WebDriver driver) {
		 this.driver = driver;

	        PageFactory.initElements(driver, this);
	}
}

