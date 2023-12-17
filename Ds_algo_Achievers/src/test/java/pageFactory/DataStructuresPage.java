package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructuresPage {

		@FindBy(xpath="//input[@name='username']") public WebElement username;
		@FindBy(xpath="//input[@name='password']") public WebElement password;		
		@FindBy(xpath="//a[@href=\"data-structures-introduction\"]") public WebElement getStartedBtn;
		@FindBy(xpath="//h4[text()='Data Structures-Introduction']") public WebElement dataStructureText;
		@FindBy(xpath="//a[@href='time-complexity']")public WebElement timeComplexityBtn;
		@FindBy(xpath="//p[text()='Time Complexity']") public WebElement timeComplexityText;
		@FindBy(xpath="//a[text()='Try here>>>']") public WebElement tryHereBtn;
		@FindBy(xpath="//form[@id='answer_form']") public WebElement InputText;
		@FindBy(xpath="//button[@type='button']")public WebElement RunBtn;
		@FindBy(xpath="//*[@id='output']") public WebElement output;
		@FindBy(xpath="//a[@href='/data-structures-introduction/practice']") public WebElement practiceQuestionLink;
		@FindBy(xpath="/html/body")public WebElement PractceQuestion_page;
		
		public DataStructuresPage(WebDriver driver){
			
	        PageFactory.initElements(driver, this);

	    }

}
