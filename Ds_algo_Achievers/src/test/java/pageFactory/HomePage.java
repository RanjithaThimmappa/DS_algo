package pageFactory;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.commonMethods;

public class HomePage {
	
	WebDriver driver;	
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
	
	public HomePage(WebDriver driver){

		this.driver = driver;
        PageFactory.initElements(driver, this);

    }

	public String getHomePageText() {

		return homePageText.getText();
		 
	}
	
}
