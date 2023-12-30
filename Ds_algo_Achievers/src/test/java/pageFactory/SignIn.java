package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Get Started']") public  WebElement getStartedButton;
	@FindBy(xpath = "//a[text()='Sign in']") public  WebElement signIn;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public  WebElement signInText;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public  WebElement inValidText;
	
	public SignIn(WebDriver driver){

		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void WarningMessage(){
		
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}
	
}
