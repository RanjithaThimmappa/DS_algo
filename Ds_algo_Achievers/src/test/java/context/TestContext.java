package context;

import java.time.Duration;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import Config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.*;

public class TestContext {

	WebDriver driver;
	
	HomePage hp;
	RegisterPage rp;
	SignIn sip;
	ArrayPage ap;
	DataStructuresPage dp;
	GraphPage gp;
	LinkedlistPage lp;
	QueuePage qp;
	Stack sp;
	TreePage tp;
	SignOut sop;
	
	public void setDriver(WebDriver driver) {
		String browser = PropertiesFile.readPropertiesFile("browser");
		System.out.println("The browser value from properties file is: "+ browser);
		
		if (browser.equalsIgnoreCase("Chrome")){
			ChromeOptions co = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			
			co.addArguments("--headless");
			co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(co);
		}

		else if(browser.equalsIgnoreCase("Edge")){
			EdgeOptions eo = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			
			eo.addArguments("--headless");
			driver = new EdgeDriver(eo);
		}

		else if(browser.equalsIgnoreCase("FireFox")) {
			
			FirefoxOptions fo = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			
			fo.addArguments("--headless");
			driver = new FirefoxDriver(fo);
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
	
	public RegisterPage getRp() {
		return rp;
	}
	
	public SignIn getSip() {
		return sip;
	}

	public ArrayPage getAp() {
		return ap;
	}

	public DataStructuresPage getDp() {
		return dp;
	}

	public GraphPage getGp() {
		return gp;
	}

	public LinkedlistPage getLp() {
		return lp;
	}

	public QueuePage getQp() {
		return qp;
	}

	public Stack getSp() {
		return sp;
	}

	public TreePage getTp() {
		return tp;
	}

	public SignOut getSop() {
		return sop;
	}
	
	public void initializePageObjects(WebDriver driver) {

		this.hp = new HomePage(driver);
		this.rp = new RegisterPage(driver);
		this.sip = new SignIn(driver);
		this.ap = new ArrayPage(driver);
		this.dp = new DataStructuresPage(driver);
		this.gp = new GraphPage(driver);
		this.qp = new QueuePage(driver);
		this.lp = new LinkedlistPage(driver);
		this.sp = new Stack(driver);
		this.tp = new TreePage(driver);
		this.sop = new SignOut(driver);

	}
	
}
