package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
	
	@FindBy(xpath = "//a[@href='graph']") public WebElement graph_getStarted;
	@FindBy(linkText = "Graph") public WebElement graphLink;
	@FindBy(linkText = "Graph Representations") public WebElement graphRepresentationsLink;
	@FindBy(xpath = "//strong//p[text()='Graph']") public WebElement graphLinkPage_Text;
	@FindBy(xpath = "//p[text()='Graph Representations']") public WebElement graphRepresentations_Text;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Graph']") public WebElement graphOption_DSDropdown;
	@FindBy(xpath = "//h4[text()='Graph']") public WebElement graphPage_Text;
	
	public GraphPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}

}
