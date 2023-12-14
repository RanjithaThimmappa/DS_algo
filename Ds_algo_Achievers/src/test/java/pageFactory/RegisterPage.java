package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
//	@FindBy(name = "username") public WebElement username_Register;
//	@FindBy(name = "password1") public WebElement password_Register;
//	@FindBy(name = "password2") public WebElement confirmPassword_Register;
//	@FindBy(linkText = " Register ") public WebElement registerLink;
//	@FindBy(xpath = "//div[@class='alert alert-primary']") public WebElement errorMessage_Register;
//	@FindBy(xpath = "//div[@class='alert alert-primary']") public WebElement success_Register;
//	@FindBy(xpath = "//input[@value='Register']") public  WebElement registerButton;

	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}

}
