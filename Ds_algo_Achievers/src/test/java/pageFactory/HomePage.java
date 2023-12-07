package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public   class HomePage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//h1[text()='Preparing for the Interviews']")
	 WebElement homePageText;

	
	

	public   HomePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
	
	


}
