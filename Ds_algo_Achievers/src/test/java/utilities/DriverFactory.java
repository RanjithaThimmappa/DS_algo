package utilities;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	//public static String Url="https://dsportalapp.herokuapp.com/";
	public static String browser;
	
	public static WebDriver initializeDriver(String browser) {
		
		if(browser == "Chrome"){
			
			ChromeOptions co = new ChromeOptions();
			co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			
			driver = new ChromeDriver(co);
			
		}
		
		else if(browser == "Edge"){
			
			driver = new EdgeDriver();
		}
		
		else if(browser == "FireFox") {
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get(browser);
		return driver;
			
		}
	
	public static void closeDriver() {
		
		driver.close();
//		driver.quit();
		
	}

}
