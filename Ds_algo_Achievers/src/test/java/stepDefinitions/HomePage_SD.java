package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageFactory.HomePage;
import utilities.DriverFactory;
public class HomePage_SD {
   
	WebDriver driver;
	HomePage hp = new HomePage(driver);
	
	@Given("User enters the  URL")
	public void user_enters_the_url() {
		driver = DriverFactory.initializeDriver("chrome");
		driver.get("https://dsportalapp.herokuapp.com");
	    
	}
}



