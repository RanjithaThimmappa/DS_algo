package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack {
	
WebDriver driver;

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
	
	public Stack(WebDriver driver){

		this.driver = driver;
        PageFactory.initElements(driver, this);
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
