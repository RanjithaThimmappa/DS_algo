package pageFactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOut {
	
	WebDriver driver;	
	
	public SignOut(WebDriver driver){

		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Get Started']") 
	public WebElement getStartedButton;
	
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
	
	@FindBy(css="h5.card-title")
	List<WebElement> datastructures;
	
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
}
