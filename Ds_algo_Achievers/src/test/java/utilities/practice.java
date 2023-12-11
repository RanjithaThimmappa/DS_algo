package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageFactory.TreePage;

public class practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		TreePage tp = new TreePage(driver);
		driver.get("https://dsportalapp.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		tp.username.sendKeys("Achievers");
		tp.password.sendKeys("34dfSnRzx@QaRH");
		tp.loginButton.click();
		tp.tree_getStarted.click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(tp.applications_of_Binary_trees).perform();
		actions.click().perform();
		System.out.println(("The landing page says: " + tp.applicationsOfBinaryTrees_Text.getText()));
		
		actions.moveToElement(tp.practice_Questions).perform();
		actions.click().perform();
		System.out.println(("The landing page says: " + tp.practiceQuestions_Text.getText()));
		
	}

}
