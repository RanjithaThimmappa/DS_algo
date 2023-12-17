package context;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.PropertiesFile;
import io.cucumber.java.Scenario;
import pageFactory.*;

public class TestContext {

	WebDriver driver;
	HomePage hp;

	public void setDriver(WebDriver driver) {
		String browser = PropertiesFile.readPropertiesFile("browser");
		System.out.println("The browser value from properties file is: "+ browser);
		
		if (browser.equalsIgnoreCase(browser)){
			
			ChromeOptions co = new ChromeOptions();
			co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(co);
		}

		else if(browser.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}

		else if(browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public HomePage getHp() {
		return hp;
	}	
	
	public void initializePageObjects(WebDriver driver) {

		this.hp = new HomePage(driver);
	}
	
}
