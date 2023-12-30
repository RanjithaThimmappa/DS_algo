package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
		
	@FindBy(xpath = "//h4[text() = 'Array']") public WebElement arrayPage;
	@FindBy(xpath = "//a[@href='arrays-in-python']") public  WebElement arrayinpythonLink;
	@FindBy(xpath = "//a[text()='Arrays Using List']") public  WebElement arrayusinglistLink;
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']") public  WebElement basicoperationsinlistsLink;
	@FindBy(xpath = "//a[text()='Applications of Array']") public  WebElement applicationofarraysLink;
	@FindBy(xpath =  "//a[text()='Search the array']")    public WebElement PracticequestionPage;
	@FindBy(xpath = "//h5[text()='Array']/../a[text() = 'Get Started']") public  WebElement getStartedButton_ArrayModule;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Arrays']") public WebElement arrayDropDownElement;
	@FindBy(linkText = "Data Structures") public  WebElement dsDropDown;
	
	public ArrayPage(WebDriver driver) {
		
      PageFactory.initElements(driver, this);
    }
}
