package pageFactory;

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

public class SignIn {

	WebDriver driver;
	
	public SignIn(WebDriver driver){

		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	//SignIn
        
	@FindBy(xpath = "//button[text()='Get Started']")
	public  WebElement getStartedButton;
	
	@FindBy(xpath = "//a[text()='Sign in']") 
	public  WebElement signIn;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']") 
	public  WebElement signInText;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']") 
	public  WebElement inValidText;
	
	
	public void WarningMessage()
	{
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	
	//SIgnOut
	

	/*
	 * @FindBy(xpath = "//button[text()='Get Started']") public WebElement
	 * getStartedButton;
	 */
	
	@FindBy(xpath = "//a[text()='Sign in']") 
	public WebElement signInLink;
	
	@FindBy(id = "id_username") 
	public WebElement username;
	
	@FindBy(id = "id_password") 
	public WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement login;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	public WebElement signOutLink;
	
	@FindBy(xpath = "/html/body/div[2]")
	public WebElement loggedOutText;
	
	/*
	 * @FindBy(css="h5.card-title") List<WebElement> datastructures;
	 */
	
	@FindBy(xpath = "//div[@class='alert alert-primary']") 
	public  WebElement notLoggedInAlert;
	
	public boolean verifySignoutText()
	{
		try {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
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
	
	//Stack


	@FindBy(css="h5.card-title")
	List<WebElement> datastructures;
	
	@FindBy(xpath="//h4[text()='Stack']")
	public WebElement stackpage;
	
	@FindBy(xpath="//a[text()='Operations in Stack']")
	public WebElement Operations_in_Stack;
	
	@FindBy(xpath="//a[text()='Implementation']")
	public WebElement Implementation;
	
	@FindBy(xpath="//a[text()='Applications']")
	public WebElement Applications;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	public WebElement tryHere;
	
	@FindBy(xpath = "//*[@id='answer_form']") 
	public  WebElement pythonCode;
	
	@FindBy(xpath = "//button[text()='Run']") 
	public  WebElement Run;
	
	@FindBy(id = "output") 
	public  WebElement Output;
	
	@FindBy(xpath = "//body") 
	public  WebElement practiceQn;
	
	@FindBy(linkText = "Data Structures")
	public  WebElement DropDown;
	
	@FindBy(linkText = "Stack") 
	public  WebElement stack_DropDown;
	
	@FindBy(xpath = "//h4[text()='Stack']") 
	public  WebElement stack_Text;
	
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
